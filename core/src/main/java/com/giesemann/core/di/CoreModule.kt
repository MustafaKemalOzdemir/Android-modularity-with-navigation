package com.giesemann.core.di

import android.app.Application
import android.content.Context
import com.giesemann.core.cache.AuthPreference
import com.giesemann.core.cache.AuthPreferenceImpl
import com.giesemann.core.cache.LynkPreferencesManager
import com.giesemann.core.cache.LynkPreferencesManagerImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
Created by Mustafa Kemal ÖZDEMİR on 5.02.2021
 */
@Module
class CoreModule {
    @Provides
    fun provideAppContext(app: Application): Context = app.applicationContext

    @Singleton
    @Provides
    fun provideAuthPrefences(provide: AuthPreferenceImpl) : AuthPreference = provide

    @Singleton
    @Provides
    fun provideLynkPreferences(provide: LynkPreferencesManagerImpl) : LynkPreferencesManager = provide

    /*
    @Singleton
    @Provides
    fun provideSharedManager(context: Context) = context.getSharedPreferences("prefs", Context.MODE_PRIVATE)

     */
}