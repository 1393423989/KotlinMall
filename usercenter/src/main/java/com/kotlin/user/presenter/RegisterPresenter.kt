package com.kotlin.user.presenter

import com.kotlin.base.presenter.BasePresenter
import com.kotlin.user.presenter.view.RegisterView

/**
 *  @data 2018/12/5 0005 上午 11:06.
 *  By LiBing
 */
class RegisterPresenter : BasePresenter<RegisterView>() {

    fun register(mobile: String, password: String){
        mView.onRegisterResult(true)
    }
}