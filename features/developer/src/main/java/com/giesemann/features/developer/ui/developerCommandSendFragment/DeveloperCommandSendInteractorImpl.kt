package com.giesemann.features.developer.ui.developerCommandSendFragment

import android.util.Log
import com.giesemann.core.base.ui.BaseInteractorImpl
import com.giesemann.core.cache.LynkPreferencesManager
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */
class DeveloperCommandSendInteractorImpl @Inject internal constructor(val lynkPreferencesManager: LynkPreferencesManager): BaseInteractorImpl(),
    DeveloperCommandSendInteractor {
    private val TAG = "DeveloperCommandSendInteractor"

    override fun connectDevice() {
    }

    override suspend fun sendByteData(byteArray: ByteArray): Boolean {
        val didSentData = CompletableDeferred<Boolean>()
        didSentData.complete(false)
        return didSentData.await()
    }

    override fun listen() {
        CoroutineScope(Dispatchers.IO).launch {
        }
    }

}