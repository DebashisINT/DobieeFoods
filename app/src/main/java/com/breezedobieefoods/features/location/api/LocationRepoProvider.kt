package com.breezedobieefoods.features.location.api

import com.breezedobieefoods.features.location.shopdurationapi.ShopDurationApi
import com.breezedobieefoods.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}