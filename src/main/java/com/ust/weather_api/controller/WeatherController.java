package com.ust.weather_api.controller;

import com.ust.weather_api.response.WeatherData;
import com.ust.weather_api.service.ApiCallerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final ApiCallerService apiCallerService;

    @GetMapping("/forecast")
    public ResponseEntity<WeatherData> getWeatherDataByLocation(@RequestParam("latitude") double latitude, @RequestParam("longitude") double longitude) {
        return ResponseEntity.ok(apiCallerService.getWeatherDataByLocation(latitude, longitude));
    }
}
