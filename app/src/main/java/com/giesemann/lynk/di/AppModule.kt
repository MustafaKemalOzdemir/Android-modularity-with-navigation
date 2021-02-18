package com.giesemann.lynk.di

import com.giesemann.lynk.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class AppModule {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

}