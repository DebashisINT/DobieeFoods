package com.breezedobieefoods.features.survey.api

import com.breezedobieefoods.features.photoReg.api.GetUserListPhotoRegApi
import com.breezedobieefoods.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}