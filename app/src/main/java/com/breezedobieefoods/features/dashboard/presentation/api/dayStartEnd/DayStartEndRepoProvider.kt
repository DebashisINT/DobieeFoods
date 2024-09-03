package com.breezedobieefoods.features.dashboard.presentation.api.dayStartEnd

import com.breezedobieefoods.features.stockCompetetorStock.api.AddCompStockApi
import com.breezedobieefoods.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}