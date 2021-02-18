package com.giesemann.core.cache

import javax.inject.Inject

/**
Created by Mustafa Kemal Özdemir on 9.02.2021
 */
class LynkPreferencesManagerImpl @Inject internal constructor(private val authPreference: AuthPreference):
    LynkPreferencesManager {

    override fun saveUser(userName: String, userPass: String) {
        authPreference.saveUser(userName, userPass)
    }
}