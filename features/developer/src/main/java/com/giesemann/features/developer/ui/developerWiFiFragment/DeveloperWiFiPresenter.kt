package com.giesemann.features.developer.ui.developerWiFiFragment

import com.giesemann.core.base.ui.BasePresenter

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */
interface DeveloperWiFiPresenter<V : DeveloperWiFiView, I : DeveloperWiFiInteractor, R : DeveloperWiFiRouter>
    : BasePresenter<V, I, R> {
        fun backButtonPressed()
}