package com.giesemann.features.developer.ui

import android.util.Log
import com.giesemann.core.base.ui.BasePresenterImpl
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 10.02.2021
 */
class DeveloperPresenterImpl<V : DeveloperView, I : DeveloperInteractor, R : DeveloperRouter>
    @Inject internal constructor(interactor: I, router: R):
    BasePresenterImpl<V, I, R>(interactor = interactor, router = router),
    DeveloperPresenter<V, I, R> {

    private val TAG = "Development_Presenter"

    override fun wifiSearchButtonPressed() {
        router?.navigateWifiSearch()
        Log.v(TAG, "Wifi search button pressed")
    }

    override fun bluetoothSearchButtonPressed() {
        Log.v(TAG, "Bluetooth search button pressed")
    }

    override fun commandSendButtonPressed() {
        router?.navigateCommandSend()
        Log.v(TAG, "Command Send button pressed")
    }

    override fun backButtonPressed() {
        router?.navigateDeviceConfiguration()
        Log.v(TAG, "Back button pressed")
    }

}