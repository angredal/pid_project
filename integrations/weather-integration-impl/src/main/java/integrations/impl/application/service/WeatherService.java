package integrations.impl.application.service;

import api.WeatherDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final RestTemplate restTemplate;

    @Value("${weather.api.key}")
    private String apiKey;

    public WeatherDto getWeather(String cityName) {
        String uri = String.format("http://api.weatherapi.com/v1/current.json?key=%s&q=%s&aqi=no", apiKey, cityName);
        return restTemplate.getForObject(uri, WeatherDto.class);
    }




}
