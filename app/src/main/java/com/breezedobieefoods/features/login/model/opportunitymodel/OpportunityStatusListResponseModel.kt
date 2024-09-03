package com.breezedobieefoods.features.login.model.opportunitymodel

import com.breezedobieefoods.app.domain.OpportunityStatusEntity
import com.breezedobieefoods.app.domain.ProductListEntity
import com.breezedobieefoods.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}