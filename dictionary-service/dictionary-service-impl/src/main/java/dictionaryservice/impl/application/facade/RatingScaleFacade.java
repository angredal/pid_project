package dictionaryservice.impl.application.facade;

import api.dto.RatingScaleDto;
import dictionaryservice.impl.application.mapper.RatingScaleMapper;
import dictionaryservice.impl.domain.service.RatingScaleDomainService;
import jakarta.annotation.Nullable;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RatingScaleFacade {

    private final RatingScaleDomainService ratingScaleDomainService;
    private final RatingScaleMapper ratingScaleMapper;

    @Nullable
    @Transactional
    public RatingScaleDto findById(UUID uuid) {
        return ratingScaleMapper.toRatingScaleDto(ratingScaleDomainService.findById(uuid));
    }
    @Transactional
    public List<RatingScaleDto> findAll() {
        return ratingScaleDomainService.findAll().stream()
                .map(ratingScaleMapper::toRatingScaleDto)
                .toList();
    }

}
