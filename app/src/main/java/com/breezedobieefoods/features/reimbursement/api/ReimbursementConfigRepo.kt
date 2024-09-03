package com.breezedobieefoods.features.reimbursement.api

import com.breezedobieefoods.features.reimbursement.model.ReimbursementConfigResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 24-01-2019.
 */
class ReimbursementConfigRepo(val apiService: ReimbursementConfigApi) {
    fun getReimbursementConfig(user_id: String, state_id: String): Observable<ReimbursementConfigResponseModel> {
        return apiService.getReimbursementConfig(user_id, state_id)
    }
}