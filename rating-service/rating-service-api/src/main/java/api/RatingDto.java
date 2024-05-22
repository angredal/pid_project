package api;


import lombok.Data;
import lombok.Value;

import java.util.UUID;

@Value
public class RatingDto {

     UUID id;
     String rate;
     int position;

}
