package com.giesemann.navigation.di

import android.app.Application
import com.giesemann.navigation.LynkNavigationManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
Created by Mustafa Kemal ÖZDEMİR on 12.02.2021
 */
@Singleton
@Component(modules = [NavigationModule::class])
interface NavigationComponent {

    fun getAppNavigationManager(): LynkNavigationManager


    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): NavigationComponent
    }
}