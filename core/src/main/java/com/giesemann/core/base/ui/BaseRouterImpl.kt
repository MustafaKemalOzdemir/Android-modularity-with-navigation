package com.giesemann.core.base.ui

import androidx.navigation.NavController
import com.giesemann.core.base.ui.BaseRouter

/**
Created by Mustafa Kemal ÖZDEMİR on 5.02.2021
 */
abstract class BaseRouterImpl: BaseRouter {
    var navController: NavController? = null

    override fun attachNavigator(navController: NavController) {
        this.navController = navController
    }
}