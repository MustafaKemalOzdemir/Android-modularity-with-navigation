package com.giesemann.features.developer.di.module

//todo add this module to contributor

import com.giesemann.features.developer.ui.developerWiFiFragment.*
import dagger.Module
import dagger.Provides

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */
@Module
abstract class DeveloperWiFiFragmentModule {

    companion object {
        @Provides
        internal fun provideDeveloperWiFiInteractor(interactor: DeveloperWiFiInteractorImpl): DeveloperWiFiInteractor = interactor

        @Provides
        internal fun provideDeveloperWiFiPresenter(presenter: DeveloperWiFiPresenterImpl<DeveloperWiFiView, DeveloperWiFiInteractor, DeveloperWiFiRouter>):
                DeveloperWiFiPresenter<DeveloperWiFiView, DeveloperWiFiInteractor, DeveloperWiFiRouter> = presenter

        @Provides
        internal fun provideDeveloperWiFiRouter(router: DeveloperWiFiRouterImpl): DeveloperWiFiRouter = router
    }
}