package com.ust.weather_api.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {
    private double latitude;
    private double longitude;
    private double generationTime_ms;
    private int utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private double elevation;
    private HourlyUnits hourly_units;
    private Hourly hourly;

    // Getters and Setters
    @Data
    public static class HourlyUnits {
        private String time;
        private String temperature_2m;

        // Getters and Setters
    }

    @Data
    public static class Hourly {
        private List<String> time;
        private List<Double> temperature_2m;

        // Getters and Setters
    }
}
