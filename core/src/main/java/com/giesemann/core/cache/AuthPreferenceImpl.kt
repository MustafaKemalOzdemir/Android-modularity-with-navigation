package com.giesemann.core.cache

import android.content.Context
import android.util.Log
import com.giesemann.core.cache.BaseSharedPreferencesHelper
import javax.inject.Inject

/**
Created by Mustafa Kemal ÖZDEMİR on 9.02.2021
 */
class AuthPreferenceImpl @Inject internal constructor(context: Context) : BaseSharedPreferencesHelper(
    context,
    "PREF_AUTH"
), AuthPreference {

    override fun saveUser(userName: String, userPass: String) {
        Log.v("LyncTest", "Manager $userName")
        //put("aa", 0L)
    }
}