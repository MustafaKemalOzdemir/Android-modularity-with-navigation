package com.giesemann.core.base.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import dagger.android.support.AndroidSupportInjection

/**
Created by Mustafa Kemal ÖZDEMİR on 5.02.2021
 */
abstract class BaseFragment: Fragment(), BaseView {
    private var parentActivity: BaseActivity? = null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is BaseActivity){
            this.parentActivity = context
            context.onFragmentAttached()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        performDependencyInjection()
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp(view)
    }

    fun getBaseActivity() = parentActivity

    private fun performDependencyInjection() = AndroidSupportInjection.inject(this)

    interface CallBack {
        fun onFragmentAttached()
        fun onFragmentDetached(tag: String)
    }

    abstract fun setUp(view:View)

    override fun showProgress() {
        //baseactivity;showp
    }

    override fun hideProgress() {

    }

}