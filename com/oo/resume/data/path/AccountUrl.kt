package com.oo.resume.data.path

/**
 *   yangchao
 *    cd.uestc.superyoung@gmail.com
 *     2019-07-24 10:08
 *
 */
interface AccountUrl {
    companion object {

        const val PREFIX = "/api/account"

        /**
         * 注册
         * Method:POST
         *
         * Request:[com.oo.resume.data.request.RegistRequest]
         *
         * Response:[com.oo.resume.data.response.AccountDTO]
         *
         */
        const val PATH_REGIST = "/regist"
        /**
         * 登录
         * Method:POST
         *
         * Request:[com.oo.resume.data.request.LoginRequest]
         *
         * Response:[com.oo.resume.data.response.AccountDTO]
         *
         */
        const val PATH_LOGIN = "/login"
        /**
         * 更新
         * Method:PUT
         *
         * Request:[com.oo.resume.data.response.AccountDTO]
         *
         * Response:[com.oo.resume.data.response.AccountDTO]
         *
         */
        const val PATH_UPDATE = "/update"
    }
}