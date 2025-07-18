package pragya.anu.weather.data.network

import pragya.anu.weather.BuildConfig
import pragya.anu.weather.data.model.ForecastResponse
import pragya.anu.weather.utils.DEFAULT_WEATHER_DESTINATION
import pragya.anu.weather.utils.NUMBER_OF_DAYS
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("forecast.json")
    suspend fun getWeatherForecast(
        @Query("key") key: String = BuildConfig.API_KEY,
        @Query("q") city: String = DEFAULT_WEATHER_DESTINATION,
        @Query("days") days: Int = NUMBER_OF_DAYS,
    ): ForecastResponse
}