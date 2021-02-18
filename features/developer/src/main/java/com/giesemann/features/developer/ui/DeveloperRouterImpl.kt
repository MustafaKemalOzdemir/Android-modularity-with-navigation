package com.giesemann.features.developer.ui

import com.giesemann.core.base.ui.BaseRouterImpl
import com.giesemann.features.developer.R
import com.giesemann.navigation.LynkNavigationManager
import com.giesemann.navigation.NavigationFlow
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 10.02.2021
 */
class DeveloperRouterImpl @Inject internal constructor(private val lynkNavigationManager: LynkNavigationManager): BaseRouterImpl(), DeveloperRouter {

    override fun navigateWifiSearch() {
        navController?.navigate(R.id.action_developmentFragment_to_developerWiFiFragment)
    }

    override fun navigateBluetoothSearch() {

    }

    override fun navigateCommandSend() {
        navController?.navigate(R.id.action_developmentFragment_to_developerCommandSendFragment)
    }

    override fun navigateDeviceConfiguration() {
        lynkNavigationManager.navigateModule(NavigationFlow.DEVICE_CONFIGURATION)
    }
}