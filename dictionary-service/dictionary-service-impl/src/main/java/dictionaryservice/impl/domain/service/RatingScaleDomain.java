package dictionaryservice.impl.domain.service;


import dictionaryservice.impl.domain.dao.RatingScaleDao;
import dictionaryservice.impl.domain.entity.RatingScale;
import jakarta.annotation.Nullable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RatingScaleDomain {
    private final RatingScaleDao ratingScaleDao;


    @Nullable
    public RatingScale findById(UUID uuid) {
        return ratingScaleDao.findById(uuid).orElse(null);
    }

    public List<RatingScale> findAll() {
        return ratingScaleDao.findAll();
    }



}
