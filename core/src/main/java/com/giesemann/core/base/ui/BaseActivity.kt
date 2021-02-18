package com.giesemann.core.base.ui

import dagger.android.support.DaggerAppCompatActivity

/**
Created by Mustafa Kemal ÖZDEMİR on 5.02.2021
 */
abstract class BaseActivity: DaggerAppCompatActivity(), BaseView, BaseFragment.CallBack {

    override fun showProgress() {
    }

    override fun hideProgress() {
    }

    override fun onFragmentAttached() {
    }

    override fun onFragmentDetached(tag: String) {
    }

}