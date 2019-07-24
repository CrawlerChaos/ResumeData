package com.oo.resume.data.path

/**
 *   yangchao
 *    cd.uestc.superyoung@gmail.com
 *     2019-07-24 09:53
 *
 */
interface ResumeUrl {
    companion object {
        const val PARAMS_RESUME_ID = "resumeId"

        const val PREFIX = "/api/resume"

        /**
         * 简历列表
         * Method:GET
         *
         * Response:[List] OF [com.oo.resume.data.response.ResumeDTO]
         *
         */
        const val PATH_LIST = "/list"
        /**
         * 删除简历
         * Method:DELETE
         *
         * Response:[Boolean]
         */
        const val PATH_DELETE = "/delete/{$PARAMS_RESUME_ID}"
        /**
         * 简历详情
         * Method:GET
         *
         * Response:[com.oo.resume.data.response.ResumeDTO]
         *
         */
        const val PATH_DETAIL = "/detail/{$PARAMS_RESUME_ID}"

        /**
         * 更新简历或者新建简历
         * Method:POST
         *
         * Request:[com.oo.resume.data.response.ResumeDTO]
         *
         * Response:[com.oo.resume.data.response.ResumeDTO]
         *
         */
        const val PATH_CREATE_OR_UPDATE = "/createOrUpdate"

    }
}