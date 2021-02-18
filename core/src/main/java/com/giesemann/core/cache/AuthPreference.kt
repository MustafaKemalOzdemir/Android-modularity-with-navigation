package com.giesemann.core.cache

/**
Created by Mustafa Kemal ÖZDEMİR on 9.02.2021
 */
interface AuthPreference {
    fun saveUser(userName: String, userPass: String)
}