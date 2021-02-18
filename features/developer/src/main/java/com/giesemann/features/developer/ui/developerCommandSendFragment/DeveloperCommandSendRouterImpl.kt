package com.giesemann.features.developer.ui.developerCommandSendFragment

import com.giesemann.core.base.ui.BaseRouterImpl
import com.giesemann.features.developer.ui.developerCommandSendFragment.DeveloperCommandSendRouter
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */
class DeveloperCommandSendRouterImpl @Inject internal constructor(): BaseRouterImpl(), DeveloperCommandSendRouter {

    override fun navigateBack() {
        navController?.navigateUp()
    }

}