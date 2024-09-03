package com.breezedobieefoods.features.document.api

import com.breezedobieefoods.features.dymanicSection.api.DynamicApi
import com.breezedobieefoods.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}