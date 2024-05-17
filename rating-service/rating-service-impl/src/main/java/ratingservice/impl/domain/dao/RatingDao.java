package ratingservice.impl.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ratingservice.impl.domain.entity.Rating;

import java.util.UUID;

public interface RatingDao extends JpaRepository<Rating, UUID> {
}
