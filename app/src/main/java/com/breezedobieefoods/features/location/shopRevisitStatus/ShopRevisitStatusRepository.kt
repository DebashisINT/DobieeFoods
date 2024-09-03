package com.breezedobieefoods.features.location.shopRevisitStatus

import com.breezedobieefoods.base.BaseResponse
import com.breezedobieefoods.features.location.model.ShopDurationRequest
import com.breezedobieefoods.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}