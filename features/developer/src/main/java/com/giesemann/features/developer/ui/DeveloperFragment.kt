package com.giesemann.features.developer.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import com.giesemann.core.base.ui.BaseFragment
import com.giesemann.features.developer.R
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 10.02.2021
 */
class DeveloperFragment: BaseFragment(), DeveloperView {

    @Inject
    internal lateinit var presenter: DeveloperPresenter<DeveloperView, DeveloperInteractor, DeveloperRouter>
    private lateinit var wifiSearchButton: Button
    private lateinit var bluetoothSearchButton: Button
    private lateinit var commandSendButton: Button
    private lateinit var backButton: ImageButton

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_developer, container, false)
    }

    override fun setUp(view: View) {
        presenter.onAttach(this, findNavController())
        initializeView(view)
        initializeInteractions()
    }

    private fun initializeView(view: View){
        wifiSearchButton = view.findViewById(R.id.developerFragment_wifiSearch_button)
        bluetoothSearchButton = view.findViewById(R.id.developerFragment_bluetoothSearch_button)
        commandSendButton = view.findViewById(R.id.developerFragment_commandSend_button)
        backButton = view.findViewById(R.id.developerFragment_back_imageButton)
    }

    private fun initializeInteractions(){
        wifiSearchButton.setOnClickListener { presenter.wifiSearchButtonPressed() }
        bluetoothSearchButton.setOnClickListener { presenter.bluetoothSearchButtonPressed() }
        commandSendButton.setOnClickListener { presenter.commandSendButtonPressed() }
        backButton.setOnClickListener { presenter.backButtonPressed() }
    }
    
}