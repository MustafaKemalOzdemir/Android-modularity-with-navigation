package com.giesemann.features.deviceconfiguration.di

import com.giesemann.features.deviceconfiguration.di.module.DeviceConfigurationFragmentModule
import com.giesemann.features.deviceconfiguration.di.scopes.DeviceConfigurationFragmentScope
import com.giesemann.features.deviceconfiguration.ui.DeviceConfigurationFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
Created by Mustafa Kemal ÖZDEMİR on 12.02.2021
 */
@Module
abstract class DeviceConfigurationContributor {

    @ContributesAndroidInjector(
        modules = [
            DeviceConfigurationFragmentModule::class,
        ]
    )
    @DeviceConfigurationFragmentScope
    abstract fun deviceConfigurationFragment(): DeviceConfigurationFragment

}