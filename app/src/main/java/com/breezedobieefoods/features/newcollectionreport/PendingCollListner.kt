package com.breezedobieefoods.features.newcollectionreport

import com.breezedobieefoods.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}