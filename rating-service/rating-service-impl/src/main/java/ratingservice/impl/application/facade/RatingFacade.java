package ratingservice.impl.application.facade;


import api.RatingDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ratingservice.impl.application.mapper.RatingMapper;
import ratingservice.impl.domain.service.RatingDomainService;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RatingFacade {
    private final RatingDomainService ratingDomainService;
    private final RatingMapper ratingMapper;

    public RatingDto findById(UUID uuid) {
        return ratingMapper.toRatingDto(ratingDomainService.findById(uuid));
    }

    public List<RatingDto> findAll() {
        return ratingDomainService.findAll().stream()
                .map(ratingMapper::toRatingDto)
                .toList();
    }

}
