package com.giesemann.features.developer.ui

import com.giesemann.core.base.ui.BaseRouter

/**
Created by Mustafa Kemal ÖZDEMİR on 10.02.2021
 */
interface DeveloperRouter: BaseRouter {
    fun navigateWifiSearch()

    fun navigateBluetoothSearch()

    fun navigateCommandSend()

    fun navigateDeviceConfiguration()
}