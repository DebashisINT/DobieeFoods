package com.breezedobieefoods.features.login.model.productlistmodel

import com.breezedobieefoods.app.domain.ModelEntity
import com.breezedobieefoods.app.domain.ProductListEntity
import com.breezedobieefoods.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}