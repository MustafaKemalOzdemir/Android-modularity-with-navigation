package com.giesemann.core.base.ui

import androidx.navigation.NavController

/**
Created by Mustafa Kemal ÖZDEMİR on 5.02.2021
 */
interface BasePresenter <V : BaseView, I : BaseInteractor, R : BaseRouter> {
    fun onAttach(view: V?, navController: NavController)

    fun onDetach()

    fun getView(): V?
}