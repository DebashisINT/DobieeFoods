package com.breezedobieefoods.features.weather.api

import com.breezedobieefoods.features.task.api.TaskApi
import com.breezedobieefoods.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}