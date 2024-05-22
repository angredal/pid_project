package dictionaryservice.impl.application.facade;

import api.dto.RatingScaleDto;
import dictionaryservice.impl.application.mapper.RatingScaleMapper;
import dictionaryservice.impl.domain.service.RatingScaleDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RatingScaleFacade {
    private final RatingScaleDomain ratingScaleDomain;
    private final RatingScaleMapper ratingScaleMapper;


    public RatingScaleDto findById(UUID uuid) {
        return ratingScaleMapper.toRatingScaleDto(ratingScaleDomain.findById(uuid));
    }

    public List<RatingScaleDto> findAll() {
        return ratingScaleDomain.findAll().stream()
                .map(ratingScaleMapper::toRatingScaleDto)
                .toList();
    }

}
