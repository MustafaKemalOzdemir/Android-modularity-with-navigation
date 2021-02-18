package com.giesemann.features.developer.ui.developerCommandSendFragment

import com.giesemann.core.base.ui.BasePresenter

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */

interface DeveloperCommandSendPresenter<V : DeveloperCommandSendView, I : DeveloperCommandSendInteractor, R : DeveloperCommandSendRouter>
    : BasePresenter<V, I, R> {
    fun clearButtonPressed()

    fun connectButtonPressed()

    fun sendButtonPressed()

    fun newCommandSelected()

    fun backButtonPressed()
}