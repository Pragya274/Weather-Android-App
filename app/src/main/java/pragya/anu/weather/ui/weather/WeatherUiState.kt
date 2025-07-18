package pragya.anu.weather.ui.weather

import pragya.anu.weather.model.Weather

data class WeatherUiState(
    val weather: Weather? = null,
    val isLoading: Boolean = false,
    val errorMessage: String = "",
)
