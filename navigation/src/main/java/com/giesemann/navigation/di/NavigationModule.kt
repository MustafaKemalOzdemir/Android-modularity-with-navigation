package com.giesemann.navigation.di

import com.giesemann.navigation.LynkNavigationManager
import com.giesemann.navigation.LynkNavigationManagerImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
Created by Mustafa Kemal ÖZDEMİR on 5.02.2021
 */
@Module
class NavigationModule {

    @Singleton
    @Provides
    fun provideAppNavigationManager(provide: LynkNavigationManagerImpl) : LynkNavigationManager = provide
}