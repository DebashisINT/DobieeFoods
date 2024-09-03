package com.breezedobieefoods.features.weather.api

import com.breezedobieefoods.base.BaseResponse
import com.breezedobieefoods.features.task.api.TaskApi
import com.breezedobieefoods.features.task.model.AddTaskInputModel
import com.breezedobieefoods.features.weather.model.ForeCastAPIResponse
import com.breezedobieefoods.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}