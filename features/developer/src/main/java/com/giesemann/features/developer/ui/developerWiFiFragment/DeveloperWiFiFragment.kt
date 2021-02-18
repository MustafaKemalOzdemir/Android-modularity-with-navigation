package com.giesemann.features.developer.ui.developerWiFiFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController
import com.giesemann.core.base.ui.BaseFragment
import com.giesemann.features.developer.R
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */
class DeveloperWiFiFragment: BaseFragment(), DeveloperWiFiView {

    @Inject
    internal lateinit var presenter: DeveloperWiFiPresenter<DeveloperWiFiView, DeveloperWiFiInteractor, DeveloperWiFiRouter>
    private lateinit var backButton: ImageButton

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_developer_wifi, container, false)

    }

    override fun setUp(view: View) {
        presenter.onAttach(this, findNavController())
        initializeView(view)
        initializeInteractions()
    }

    private fun initializeView(view: View){
        backButton = view.findViewById(R.id.wifiSearchFragment_back_imageButton)
    }

    private fun initializeInteractions(){
        backButton.setOnClickListener { presenter.backButtonPressed() }
    }

    
}