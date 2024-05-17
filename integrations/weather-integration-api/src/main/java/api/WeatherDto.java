package api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherDto {
    @JsonProperty("temp_c")
    private int temperature;
    @JsonProperty("name")
    private String cityName;
}
