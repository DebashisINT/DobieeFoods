package com.breezedobieefoods.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezedobieefoods.app.FileUtils
import com.breezedobieefoods.app.Pref
import com.breezedobieefoods.base.BaseResponse
import com.breezedobieefoods.features.addshop.model.AddLogReqData
import com.breezedobieefoods.features.addshop.model.AddShopRequestData
import com.breezedobieefoods.features.addshop.model.AddShopResponse
import com.breezedobieefoods.features.addshop.model.LogFileResponse
import com.breezedobieefoods.features.addshop.model.UpdateAddrReq
import com.breezedobieefoods.features.contacts.CallHisDtls
import com.breezedobieefoods.features.contacts.CompanyReqData
import com.breezedobieefoods.features.contacts.ContactMasterRes
import com.breezedobieefoods.features.contacts.SourceMasterRes
import com.breezedobieefoods.features.contacts.StageMasterRes
import com.breezedobieefoods.features.contacts.StatusMasterRes
import com.breezedobieefoods.features.contacts.TypeMasterRes
import com.breezedobieefoods.features.dashboard.presentation.DashboardActivity
import com.breezedobieefoods.features.login.model.WhatsappApiData
import com.breezedobieefoods.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}