package com.ust.weather_api.service;

import com.ust.weather_api.response.WeatherData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class ApiCallerService {

    private final RestClient restClient;

    public WeatherData getWeatherDataByLocation(double latitude, double longitude) {
        return restClient.get()
                .uri("/forecast?latitude={latitude}&longitude={longitude}&hourly=temperature_2m", latitude, longitude)
                .retrieve()
                .body(WeatherData.class);
    }
}
