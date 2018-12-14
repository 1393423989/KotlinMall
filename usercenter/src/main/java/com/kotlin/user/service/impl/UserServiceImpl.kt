package com.kotlin.user.service.impl

import com.kotlin.user.service.UserService
import rx.Observable

/**
 *  @data 2018/12/6 0006 上午 11:10.
 *  By LiBing
 */
class UserServiceImpl :UserService{
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }
}