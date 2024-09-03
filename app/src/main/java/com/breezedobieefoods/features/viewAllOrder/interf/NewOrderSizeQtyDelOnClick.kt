package com.breezedobieefoods.features.viewAllOrder.interf

import com.breezedobieefoods.app.domain.NewOrderGenderEntity
import com.breezedobieefoods.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}