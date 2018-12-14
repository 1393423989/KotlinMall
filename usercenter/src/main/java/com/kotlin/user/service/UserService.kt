package com.kotlin.user.service

import rx.Observable

/**
 *  @data 2018/12/6 0006 上午 11:04.
 *  By LiBing
 */
interface UserService {

    fun register(mobile: String, verifyCode: String, pwd: String):Observable<Boolean>
}