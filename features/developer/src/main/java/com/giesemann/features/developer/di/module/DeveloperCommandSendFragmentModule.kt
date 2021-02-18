package com.giesemann.features.developer.di.module

//todo add this module to contributor

import com.giesemann.features.developer.ui.developerCommandSendFragment.*
import dagger.Module
import dagger.Provides

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */
@Module
abstract class DeveloperCommandSendFragmentModule {

    companion object {
        @Provides
        internal fun provideDeveloperCommandSendInteractor(interactor: DeveloperCommandSendInteractorImpl): DeveloperCommandSendInteractor = interactor

        @Provides
        internal fun provideDeveloperCommandSendPresenter(presenter: DeveloperCommandSendPresenterImpl<DeveloperCommandSendView, DeveloperCommandSendInteractor, DeveloperCommandSendRouter>):
                DeveloperCommandSendPresenter<DeveloperCommandSendView, DeveloperCommandSendInteractor, DeveloperCommandSendRouter> = presenter

        @Provides
        internal fun provideDeveloperCommandSendRouter(router: DeveloperCommandSendRouterImpl): DeveloperCommandSendRouter = router
    }
}