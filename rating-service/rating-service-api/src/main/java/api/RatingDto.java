package api;


import lombok.Data;

import java.util.UUID;

@Data
public class RatingDto {

    private UUID id;
    private String rating;
    private int position;

}
