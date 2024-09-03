package com.breezedobieefoods.features.lead.api

import com.breezedobieefoods.features.NewQuotation.api.GetQuotListRegRepository
import com.breezedobieefoods.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}