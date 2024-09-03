package com.breezedobieefoods.features.nearbyuserlist.api

import com.breezedobieefoods.app.Pref
import com.breezedobieefoods.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezedobieefoods.features.newcollection.model.NewCollectionListResponseModel
import com.breezedobieefoods.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}