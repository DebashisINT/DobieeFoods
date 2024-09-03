package com.breezedobieefoods.features.activities.api

import com.breezedobieefoods.features.member.api.TeamApi
import com.breezedobieefoods.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}