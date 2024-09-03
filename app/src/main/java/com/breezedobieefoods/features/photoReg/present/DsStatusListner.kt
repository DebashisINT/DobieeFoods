package com.breezedobieefoods.features.photoReg.present

import com.breezedobieefoods.app.domain.ProspectEntity
import com.breezedobieefoods.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}