package pragya.anu.weather.data.repository

import pragya.anu.weather.model.Weather
import pragya.anu.weather.utils.Result
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getWeatherForecast(city: String): Flow<Result<Weather>>
}