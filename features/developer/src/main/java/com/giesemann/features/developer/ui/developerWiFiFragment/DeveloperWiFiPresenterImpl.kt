package com.giesemann.features.developer.ui.developerWiFiFragment

import com.giesemann.core.base.ui.BasePresenterImpl
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */
class DeveloperWiFiPresenterImpl<V : DeveloperWiFiView, I : DeveloperWiFiInteractor, R : DeveloperWiFiRouter>
    
    @Inject internal constructor(interactor: I, router: R):
    BasePresenterImpl<V, I, R>(interactor = interactor, router = router),
    DeveloperWiFiPresenter<V, I, R> {

    override fun backButtonPressed() {
        router?.navigateBack()
    }

}