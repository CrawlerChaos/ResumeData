package com.oo.resume.data.request

/**
 *   yangchao
 *    cd.uestc.superyoung@gmail.com
 *     2019-06-06 17:01
 *
 */
data class ResetPasswordRequest constructor(
    val oldPassword: String?,
    val newPasswod: String?
)