package api.dto;

import lombok.Value;

import java.util.UUID;

@Value
public class RatingScaleDto {
     UUID uuid;
     int degree;
     String rating;
}
