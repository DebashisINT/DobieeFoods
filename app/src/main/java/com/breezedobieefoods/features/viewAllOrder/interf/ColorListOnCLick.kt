package com.breezedobieefoods.features.viewAllOrder.interf

import com.breezedobieefoods.app.domain.NewOrderGenderEntity
import com.breezedobieefoods.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}