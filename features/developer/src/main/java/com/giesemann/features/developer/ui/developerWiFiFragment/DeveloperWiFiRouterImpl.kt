package com.giesemann.features.developer.ui.developerWiFiFragment

import com.giesemann.core.base.ui.BaseRouterImpl
import com.giesemann.features.developer.ui.developerWiFiFragment.DeveloperWiFiRouter
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */
class DeveloperWiFiRouterImpl @Inject internal constructor(): BaseRouterImpl(), DeveloperWiFiRouter {

    override fun navigateBack() {
        navController?.navigateUp()
    }

}