package com.giesemann.features.developer.di.module

import com.giesemann.features.developer.ui.*
import dagger.Module
import dagger.Provides

/**
Created by Mustafa Kemal ÖZDEMİR on 10.02.2021
 */
@Module
abstract class DeveloperFragmentModule {

    companion object {
        @Provides
        internal fun provideDevelopmentInteractor(interactor: DeveloperInteractorImpl): DeveloperInteractor = interactor

        @Provides
        internal fun provideDevelopmentPresenter(presenter: DeveloperPresenterImpl<DeveloperView, DeveloperInteractor, DeveloperRouter>):
                DeveloperPresenter<DeveloperView, DeveloperInteractor, DeveloperRouter> = presenter

        @Provides
        internal fun provideDevelopmentRouter(router: DeveloperRouterImpl): DeveloperRouter = router
    }

}