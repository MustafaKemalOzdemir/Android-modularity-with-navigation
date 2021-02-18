package com.giesemann.navigation

import androidx.navigation.NavController
import androidx.navigation.NavDirections
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */
class LynkNavigationManagerImpl @Inject internal constructor(): LynkNavigationManager {
    lateinit var navController: NavController
    override fun initializeAppNavManager(navController: NavController) {
        this.navController = navController
    }

    override fun navigateModule(navigationFlow: NavigationFlow) {
        navController.navigate(navigationFlow.id)
    }
}
