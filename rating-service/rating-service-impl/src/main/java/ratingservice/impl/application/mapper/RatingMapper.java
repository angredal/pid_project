package ratingservice.impl.application.mapper;

import api.RatingDto;
import org.mapstruct.Mapper;
import ratingservice.impl.domain.entity.Rating;

@Mapper
public interface RatingMapper {
    Rating toRating (RatingDto ratingDto);
    RatingDto toRatingDto (Rating rating);
}
