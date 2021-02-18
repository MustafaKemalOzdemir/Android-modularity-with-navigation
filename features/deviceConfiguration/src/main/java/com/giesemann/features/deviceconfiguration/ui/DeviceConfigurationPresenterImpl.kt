package com.giesemann.features.deviceconfiguration.ui

import com.giesemann.core.base.ui.BasePresenterImpl
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 12.02.2021
 */
class DeviceConfigurationPresenterImpl<V : DeviceConfigurationView, I : DeviceConfigurationInteractor, R : DeviceConfigurationRouter>
    
    @Inject internal constructor(interactor: I, router: R):
    BasePresenterImpl<V,I,R>(interactor = interactor, router = router),
    DeviceConfigurationPresenter<V, I, R> {

    override fun translateDeveloperFragmentButtonPressed() {
        router?.navigateDeveloperFragment()
    }

}