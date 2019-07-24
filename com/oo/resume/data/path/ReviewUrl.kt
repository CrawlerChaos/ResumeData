package com.oo.resume.data.path

/**
 *   yangchao
 *    cd.uestc.superyoung@gmail.com
 *     2019-07-24 10:08
 *
 */
interface ReviewUrl {
    companion object {

        const val PARAM_SHORT_LINK = "shortLink"

        const val PREFIX = "/review"

        /**
         * H5页面简历预览
         */
        const val PATH_PREVIEW = "/{$PARAM_SHORT_LINK}"
    }
}