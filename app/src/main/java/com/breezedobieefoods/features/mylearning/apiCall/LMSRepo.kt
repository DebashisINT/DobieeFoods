package com.breezedobieefoods.features.mylearning.apiCall

import com.breezedobieefoods.base.BaseResponse
import com.breezedobieefoods.features.leaderboard.api.LeaderboardOverAllData
import com.breezedobieefoods.features.leaderboard.api.LeaderboardOwnData
import com.breezedobieefoods.features.login.api.opportunity.OpportunityListApi
import com.breezedobieefoods.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.breezedobieefoods.features.mylearning.CONTENT_WISE_QA_SAVE
import com.breezedobieefoods.features.mylearning.ContentCountSave_Data
import com.breezedobieefoods.features.mylearning.LMSLeaderboardOverAllData
import com.breezedobieefoods.features.mylearning.LMSLeaderboardOwnData
import com.breezedobieefoods.features.mylearning.LMS_CONTENT_INFO
import com.breezedobieefoods.features.mylearning.MyCommentListResponse
import com.breezedobieefoods.features.mylearning.MyLarningListResponse
import com.breezedobieefoods.features.mylearning.TopicListResponse
import com.breezedobieefoods.features.mylearning.VideoPlayLMS
import com.breezedobieefoods.features.mylearning.VideoTopicWiseResponse
import io.reactivex.Observable

class LMSRepo(val apiService: LMSApi) {

    fun getTopics(user_id: String): Observable<TopicListResponse> {
        return apiService.getTopics(user_id)
    }

    fun getTopicsWiseVideo(user_id: String ,topic_id: String): Observable<VideoTopicWiseResponse> {
        return apiService.getTopicswiseVideoApi(user_id,topic_id)
    }

    fun saveContentInfoApi(lms_content_info: LMS_CONTENT_INFO): Observable<BaseResponse> {
        return apiService.saveContentInfoApi(lms_content_info)
    }

    fun getMyLraningInfo(user_id: String): Observable<MyLarningListResponse> {
        return apiService.getMyLearningContentList(user_id)
    }

    fun getCommentInfo(topic_id: String ,content_id: String): Observable<MyCommentListResponse> {
        return apiService.getCommentInfo(topic_id , content_id)
    }

    fun saveContentWiseQAApi(mCONTENT_WISE_QA_SAVE: CONTENT_WISE_QA_SAVE): Observable<BaseResponse> {
        return apiService.saveContentWiseQAApi(mCONTENT_WISE_QA_SAVE)
    }

    fun saveContentCount(mContentCountSave_Data: ContentCountSave_Data): Observable<BaseResponse> {
        return apiService.saveContentCount(mContentCountSave_Data)
    }

    fun ownDatalist(user_id: String,branchwise: String,flag: String): Observable<LMSLeaderboardOwnData> {
        return apiService.ownDatalist(user_id,branchwise,flag)
    }

    fun overAllAPI(user_id: String,branchwise: String,flag: String): Observable<LMSLeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,branchwise,flag)
    }
}