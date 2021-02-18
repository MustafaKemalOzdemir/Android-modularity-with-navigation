package com.giesemann.lynk

import com.giesemann.core.di.DaggerCoreComponent
import com.giesemann.lynk.di.DaggerAppComponent
import com.giesemann.navigation.di.DaggerNavigationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerAppComponent.factory()
        .create(
            DaggerCoreComponent.factory().create(this),
            DaggerNavigationComponent.factory().create(this)
        )
}