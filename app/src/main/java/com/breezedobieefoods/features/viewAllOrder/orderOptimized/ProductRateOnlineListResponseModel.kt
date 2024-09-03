package com.breezedobieefoods.features.viewAllOrder.orderOptimized

import com.breezedobieefoods.app.domain.ProductOnlineRateTempEntity
import com.breezedobieefoods.base.BaseResponse
import com.breezedobieefoods.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}