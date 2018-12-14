package com.kotlin.base.rx

import rx.Subscriber

/**
 *  @data 2018/12/6 0006 上午 11:26.
 *  By LiBing
 */
open class BaseSubscriber<T> : Subscriber<T>() {

    override fun onNext(t: T) {
    }

    override fun onCompleted() {
    }

    override fun onError(e: Throwable?) {
    }

}