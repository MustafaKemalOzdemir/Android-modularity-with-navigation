package com.giesemann.features.developer.ui

import com.giesemann.core.base.ui.BasePresenter

/**
Created by Mustafa Kemal ÖZDEMİR on 10.02.2021
 */
interface DeveloperPresenter<V : DeveloperView, I : DeveloperInteractor, R : DeveloperRouter>
    : BasePresenter<V, I, R> {

    fun wifiSearchButtonPressed()

    fun bluetoothSearchButtonPressed()

    fun commandSendButtonPressed()

    fun backButtonPressed()

}