package integrations.impl.presentation.controller;


import api.WeatherDto;
import integrations.impl.application.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WeatherController {
    private final WeatherService weatherService;

    @GetMapping("/weather")
    public WeatherDto get(@RequestParam String city) {
        return weatherService.getWeather(city);
    }

}
