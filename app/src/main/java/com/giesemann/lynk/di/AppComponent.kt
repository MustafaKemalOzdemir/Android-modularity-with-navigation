package com.giesemann.lynk.di

import com.giesemann.core.di.CoreComponent
import com.giesemann.features.developer.di.DeveloperContributor
import com.giesemann.features.deviceconfiguration.di.DeviceConfigurationContributor
import com.giesemann.lynk.App
import com.giesemann.navigation.di.NavigationComponent
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@AppScope
@Component(
    modules = [
        AppModule::class,
        AndroidInjectionModule::class,
        DeveloperContributor::class,
        DeviceConfigurationContributor::class
    ],

    dependencies = [
        CoreComponent::class,
        NavigationComponent::class
    ]
)

interface AppComponent: AndroidInjector<App> {
    @Component.Factory
    interface Factory {
        fun create(core: CoreComponent, navigation: NavigationComponent): AppComponent
    }

    override fun inject(app: App?)
}