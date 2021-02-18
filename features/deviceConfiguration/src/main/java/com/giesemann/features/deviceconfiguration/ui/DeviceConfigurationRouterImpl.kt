package com.giesemann.features.deviceconfiguration.ui

import com.giesemann.core.base.ui.BaseRouterImpl
import com.giesemann.features.deviceconfiguration.ui.DeviceConfigurationRouter
import com.giesemann.navigation.LynkNavigationManager
import com.giesemann.navigation.NavigationFlow
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 12.02.2021
 */
class DeviceConfigurationRouterImpl @Inject internal constructor(val lynkNavigationManager: LynkNavigationManager): BaseRouterImpl(),
    DeviceConfigurationRouter {

    override fun navigateDeveloperFragment() {
        lynkNavigationManager.navigateModule(NavigationFlow.DEVELOPER)
    }
}