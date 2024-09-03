package com.breezedobieefoods.features.mylearning.apiCall

import com.breezedobieefoods.features.login.api.opportunity.OpportunityListApi
import com.breezedobieefoods.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}