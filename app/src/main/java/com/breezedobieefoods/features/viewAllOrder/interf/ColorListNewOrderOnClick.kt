package com.breezedobieefoods.features.viewAllOrder.interf

import com.breezedobieefoods.app.domain.NewOrderColorEntity
import com.breezedobieefoods.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}