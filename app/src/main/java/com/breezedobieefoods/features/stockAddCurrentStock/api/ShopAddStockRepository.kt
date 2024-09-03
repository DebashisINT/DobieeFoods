package com.breezedobieefoods.features.stockAddCurrentStock.api

import com.breezedobieefoods.base.BaseResponse
import com.breezedobieefoods.features.location.model.ShopRevisitStatusRequest
import com.breezedobieefoods.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezedobieefoods.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezedobieefoods.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezedobieefoods.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}