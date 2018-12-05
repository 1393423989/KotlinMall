package com.kotlin.base.presenter

import com.kotlin.base.presenter.view.BaseView

/**
 *  @data 2018/12/5 0005 上午 10:38.
 *  By LiBing
 */
open class BasePresenter<T : BaseView> {

    lateinit var mView: T
}