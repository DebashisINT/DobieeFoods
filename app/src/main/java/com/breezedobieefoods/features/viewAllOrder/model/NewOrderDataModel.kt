package com.breezedobieefoods.features.viewAllOrder.model

import com.breezedobieefoods.app.domain.NewOrderColorEntity
import com.breezedobieefoods.app.domain.NewOrderGenderEntity
import com.breezedobieefoods.app.domain.NewOrderProductEntity
import com.breezedobieefoods.app.domain.NewOrderSizeEntity
import com.breezedobieefoods.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

