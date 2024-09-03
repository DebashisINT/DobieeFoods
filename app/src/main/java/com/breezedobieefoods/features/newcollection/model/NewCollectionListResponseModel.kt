package com.breezedobieefoods.features.newcollection.model

import com.breezedobieefoods.app.domain.CollectionDetailsEntity
import com.breezedobieefoods.base.BaseResponse
import com.breezedobieefoods.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}