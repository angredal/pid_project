package dictionaryservice.impl.application.mapper;


import api.dto.RatingScaleDto;
import dictionaryservice.impl.domain.entity.RatingScale;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RatingScaleMapper {

    RatingScaleDto toRatingScaleDto(RatingScale ratingScale);
    RatingScale toRatingScale(RatingScaleDto ratingScaleDto);

}
