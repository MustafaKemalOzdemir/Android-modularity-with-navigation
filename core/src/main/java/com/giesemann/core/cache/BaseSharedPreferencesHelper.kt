package com.giesemann.core.cache

import android.content.Context

/**
Created by Mustafa Kemal ÖZDEMİR on 9.02.2021
 */
open class BaseSharedPreferencesHelper(context: Context, prefName: String) {
    private val mSharedPreferences = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)

    fun get(key: String, defValue: String): String {
        return mSharedPreferences.getString(key, defValue) ?: defValue
    }

    fun `is`(key: String, defValue: Boolean): Boolean {
        return mSharedPreferences.getBoolean(key, defValue)
    }

    fun get(key: String, defValue: Int): Int {
        return mSharedPreferences.getInt(key, defValue)
    }

    fun get(key: String, defValue: Long): Long {
        return mSharedPreferences.getLong(key, defValue)
    }

    fun get(key: String, defValue: Float): Float {
        return mSharedPreferences.getFloat(key, defValue)
    }

    fun put(key: String, defValue: String?) {
        mSharedPreferences.edit().putString(key, defValue).apply()
    }

    fun put(key: String?, defValue: Boolean) {
        mSharedPreferences.edit().putBoolean(key, defValue).apply()
    }

    fun put(key: String?, defValue: Int) {
        mSharedPreferences.edit().putInt(key, defValue).apply()
    }

    fun put(key: String?, defValue: Long) {
        mSharedPreferences.edit().putLong(key, defValue).apply()
    }

    fun put(key: String?, defValue: Float) {
        mSharedPreferences.edit().putFloat(key, defValue).apply()
    }

    fun remove(key: String?) {
        mSharedPreferences.edit().remove(key).apply()
    }

    fun clear() {
        mSharedPreferences.edit().clear().apply()
    }

    fun contains(key: String?): Boolean {
        return mSharedPreferences.contains(key)
    }

}