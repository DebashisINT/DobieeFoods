package com.breezedobieefoods.features.orderList.model

import com.breezedobieefoods.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}