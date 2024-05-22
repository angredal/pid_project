package ratingservice.impl.domain.service;


import jakarta.annotation.Nullable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ratingservice.impl.domain.dao.RatingDao;
import ratingservice.impl.domain.entity.Rating;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RatingDomainService {
    private final RatingDao ratingDao;

    @Nullable
    public Rating findById(UUID uuid) {
        return ratingDao.findById(uuid).orElse(null);
    }

    public List<Rating> findAll() {
        return ratingDao.findAll();
    }

}
