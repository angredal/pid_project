package api.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class RatingScaleDto {
    private UUID uuid;
    private int degree;
    private String rating;
}
