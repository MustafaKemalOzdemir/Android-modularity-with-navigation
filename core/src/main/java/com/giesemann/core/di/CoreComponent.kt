package com.giesemann.core.di

import android.app.Application
import android.content.Context
import com.giesemann.core.cache.AuthPreference
import com.giesemann.core.cache.LynkPreferencesManager
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
Created by Mustafa Kemal ÖZDEMİR on 5.02.2021
 */
@Singleton
@Component(modules = [CoreModule::class])
interface CoreComponent {

    fun getAppContext(): Context

    fun getLynkPreferencesManager(): LynkPreferencesManager

    fun getAuthPreference(): AuthPreference

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): CoreComponent
    }
}