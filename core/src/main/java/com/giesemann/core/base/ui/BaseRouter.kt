package com.giesemann.core.base.ui

import androidx.navigation.NavController

/**
Created by Mustafa Kemal ÖZDEMİR on 5.02.2021
 */
interface BaseRouter {
    fun attachNavigator(navController: NavController)
}