package com.breezedobieefoods.features.stockAddCurrentStock.api

import com.breezedobieefoods.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezedobieefoods.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}