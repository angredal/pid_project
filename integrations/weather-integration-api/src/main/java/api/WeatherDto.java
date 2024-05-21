package api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherDto {
    @JsonProperty("location")
    private Location location;
    @JsonProperty("current")
    private Current current;
    @Data
    private static class Location {
        @JsonProperty("name")
        private String cityName;
        @JsonProperty("country")
        private String countryName;
    }
    private static class Current {
        @JsonProperty("temp_c")
        private int temp;
    }
}
