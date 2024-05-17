package ratingservice.impl.application.facade;


import api.RatingDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ratingservice.impl.application.mapper.RatingMapper;
import ratingservice.impl.domain.service.RatingDomain;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RatingFacade {
    private final RatingDomain ratingDomain;
    private final RatingMapper ratingMapper;

    public RatingDto findById(UUID uuid) {
        return ratingMapper.toRatingDto(ratingDomain.findById(uuid));
    }

    public List<RatingDto> getAllRatings() {
        return ratingDomain.getAllRatings().stream()
                .map(ratingMapper::toRatingDto)
                .toList();
    }

}
