package com.giesemann.features.deviceconfiguration.ui

import com.giesemann.core.base.ui.BasePresenter

/**
Created by Mustafa Kemal ÖZDEMİR on 12.02.2021
 */
interface DeviceConfigurationPresenter<V : DeviceConfigurationView, I : DeviceConfigurationInteractor, R : DeviceConfigurationRouter>
    : BasePresenter<V, I, R> {
        fun translateDeveloperFragmentButtonPressed()
}