package com.giesemann.features.developer.di

import com.giesemann.features.developer.di.module.DeveloperCommandSendFragmentModule
import com.giesemann.features.developer.di.module.DeveloperWiFiFragmentModule
import com.giesemann.features.developer.di.module.DeveloperFragmentModule
import com.giesemann.features.developer.di.scopes.DeveloperCommandSendFragmentScope
import com.giesemann.features.developer.di.scopes.DeveloperFragmentScope
import com.giesemann.features.developer.di.scopes.DeveloperWiFiFragmentScope
import com.giesemann.features.developer.ui.developerCommandSendFragment.DeveloperCommandSendFragment
import com.giesemann.features.developer.ui.DeveloperFragment
import com.giesemann.features.developer.ui.developerWiFiFragment.DeveloperWiFiFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
Created by Mustafa Kemal ÖZDEMİR on 9.02.2021
 */
@Module
abstract class DeveloperContributor {

    @ContributesAndroidInjector(
        modules = [
            DeveloperFragmentModule::class,
        ]
    )
    @DeveloperFragmentScope
    abstract fun developerFragment(): DeveloperFragment


    @DeveloperWiFiFragmentScope
    @ContributesAndroidInjector(
        modules = [
            DeveloperWiFiFragmentModule::class
        ]
    )
    abstract fun provideDeveloperWiFiFragment(): DeveloperWiFiFragment

    @DeveloperCommandSendFragmentScope
    @ContributesAndroidInjector(
        modules = [
            DeveloperCommandSendFragmentModule::class
        ]
    )
    abstract fun provideDeveloperCommandSendFragment(): DeveloperCommandSendFragment
}