package com.giesemann.navigation

import androidx.navigation.NavController
import androidx.navigation.NavDirections

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */
interface LynkNavigationManager {
    fun initializeAppNavManager(navController: NavController)
    fun navigateModule(navigationFlow: NavigationFlow)
}