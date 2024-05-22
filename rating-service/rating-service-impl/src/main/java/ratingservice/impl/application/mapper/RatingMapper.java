package ratingservice.impl.application.mapper;

import api.RatingDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ratingservice.impl.domain.entity.Rating;

@Mapper(componentModel = "spring")
public interface RatingMapper {
    Rating toRating (RatingDto ratingDto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "rate", source = "rate")
    @Mapping(target = "position", source = "position")
    RatingDto toRatingDto (Rating rating);
}
