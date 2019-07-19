package com.oo.resume.data.path

/**
 *   yangchao
 *    cd.uestc.superyoung@gmail.com
 *     2019-06-08 11:23
 *
 */
interface UrlConst {
    companion object {
        const val RESUME_PARAMS_RESUME_ID = "resumeId"
        const val RESUME_PREFIX = "/api/resume"
        const val RESUME_LIST = "/list"
        const val RESUME_DELETE = "/delete/{$RESUME_PARAMS_RESUME_ID}"
        /**
         * 简历详情
         * Method:GET
         *
         * Response
         * @see com.oo.resume.data.response.ResumeDTO
         */
        const val RESUME_DETAIL = "/detail/{$RESUME_PARAMS_RESUME_ID}"

        /**
         * 更新简历或者新建简历
         * Method:POST
         *
         * Request
         * @see com.oo.resume.data.response.ResumeDTO}
         *
         * Response
         * @see com.oo.resume.data.response.ResumeDTO}
         */
        const val RESUME_CREATE_OR_UPDATE = "/createOrUpdate"

        const val REVIEW_PARAM_SHORT_LINK = "shortLink"
        const val REVIEW_PREFIX = "/review"
        const val REVIEW_RESUME = "/{$REVIEW_PARAM_SHORT_LINK}"

        const val ACCOUNT_PREFIX = "/api/account"
        const val ACCOUNT_REGIST = "/regist"
        const val ACCOUNT_LOGIN = "/login"
        const val ACCOUNT_UPDATE = "/update"
    }
}