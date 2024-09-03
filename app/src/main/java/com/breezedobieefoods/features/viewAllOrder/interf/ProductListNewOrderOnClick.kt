package com.breezedobieefoods.features.viewAllOrder.interf

import com.breezedobieefoods.app.domain.NewOrderGenderEntity
import com.breezedobieefoods.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}