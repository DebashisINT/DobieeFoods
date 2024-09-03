package com.breezedobieefoods.features.location.shopRevisitStatus

import com.breezedobieefoods.features.location.shopdurationapi.ShopDurationApi
import com.breezedobieefoods.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}