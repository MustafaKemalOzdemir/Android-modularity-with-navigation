package com.giesemann.features.developer.ui.developerCommandSendFragment

import android.util.Log
import com.giesemann.core.base.ui.BasePresenterImpl
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */

class DeveloperCommandSendPresenterImpl<V : DeveloperCommandSendView, I : DeveloperCommandSendInteractor, R : DeveloperCommandSendRouter>
    
    @Inject internal constructor(interactor: I, router: R):
    BasePresenterImpl<V, I, R>(interactor = interactor, router = router),
    DeveloperCommandSendPresenter<V, I, R> {

    private val TAG = "Developer_commandSend_presenter"

    override fun clearButtonPressed() {
        Log.v(TAG, "Clear Button Pressed")
        interactor?.listen()

    }

    override fun connectButtonPressed() {
        Log.v(TAG, "Connect Button Pressed")
        interactor?.connectDevice()
    }

    override fun sendButtonPressed() {
        Log.v(TAG, "Send Button Pressed")
    }

    override fun newCommandSelected() {
        Log.v(TAG, "New Command is Selected")
    }

    override fun backButtonPressed() {
        router?.navigateBack()
    }
}