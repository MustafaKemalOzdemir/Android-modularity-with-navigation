package com.giesemann.features.deviceconfiguration.di.module

//todo add this module to contributor

import com.giesemann.features.deviceconfiguration.ui.*
import dagger.Module
import dagger.Provides

/**
Created by Mustafa Kemal ÖZDEMİR on 12.02.2021
 */
@Module
abstract class DeviceConfigurationFragmentModule {

    companion object {
        @Provides
        internal fun provideDeviceConfigurationInteractor(interactor: DeviceConfigurationInteractorImpl): DeviceConfigurationInteractor = interactor

        @Provides
        internal fun provideDeviceConfigurationPresenter(presenter: DeviceConfigurationPresenterImpl<DeviceConfigurationView, DeviceConfigurationInteractor, DeviceConfigurationRouter>):
                DeviceConfigurationPresenter<DeviceConfigurationView, DeviceConfigurationInteractor, DeviceConfigurationRouter> = presenter

        @Provides
        internal fun provideDeviceConfigurationRouter(router: DeviceConfigurationRouterImpl): DeviceConfigurationRouter = router
    }
}