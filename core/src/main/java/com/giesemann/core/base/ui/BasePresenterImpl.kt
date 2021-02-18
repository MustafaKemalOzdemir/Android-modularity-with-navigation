package com.giesemann.core.base.ui

import androidx.navigation.NavController

/**
Created by Mustafa Kemal ÖZDEMİR on 5.02.2021
 */
abstract class BasePresenterImpl<V : BaseView, I : BaseInteractor, R : BaseRouter> constructor(protected var interactor: I?, protected var router: R?):
    BasePresenter<V, I, R> {
    private var view: V? = null
    private val isViewAttached: Boolean get() = view != null

    override fun onAttach(view: V?, navController: NavController) {
        this.view = view
        router?.attachNavigator(navController)
    }


    override fun getView(): V? = view

    override fun onDetach() {
        view = null
        interactor = null
        router = null
    }
}