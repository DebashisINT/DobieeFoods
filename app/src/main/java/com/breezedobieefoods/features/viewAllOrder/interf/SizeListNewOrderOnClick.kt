package com.breezedobieefoods.features.viewAllOrder.interf

import com.breezedobieefoods.app.domain.NewOrderProductEntity
import com.breezedobieefoods.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}