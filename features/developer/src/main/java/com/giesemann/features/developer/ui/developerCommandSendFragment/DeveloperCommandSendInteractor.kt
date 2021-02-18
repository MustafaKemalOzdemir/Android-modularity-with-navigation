package com.giesemann.features.developer.ui.developerCommandSendFragment

import com.giesemann.core.base.ui.BaseInteractor

/**
Created by Mustafa Kemal ÖZDEMİR on 11.02.2021
 */
interface DeveloperCommandSendInteractor: BaseInteractor {

    fun connectDevice()

    suspend fun sendByteData(byteArray: ByteArray): Boolean

    fun listen()
}