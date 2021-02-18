package com.giesemann.features.deviceconfiguration.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.giesemann.core.base.ui.BaseFragment
import com.giesemann.features.deviceconfiguration.R
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 12.02.2021
 */
class DeviceConfigurationFragment: BaseFragment(), DeviceConfigurationView {

    @Inject
    internal lateinit var presenter: DeviceConfigurationPresenter<DeviceConfigurationView, DeviceConfigurationInteractor, DeviceConfigurationRouter>
    lateinit var translateDeveloperButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_device_configuration, container, false)
    }

    override fun setUp(view: View) {
        presenter.onAttach(this, findNavController())
        initializeView(view)
        initializeInteractions()
    }

    private fun initializeView(view: View){
        translateDeveloperButton = view.findViewById(R.id.deviceConfigurationFragment_translate2DeveloperFragment_button)
    }

    private fun initializeInteractions(){
        translateDeveloperButton.setOnClickListener { presenter.translateDeveloperFragmentButtonPressed() }
    }
    
}