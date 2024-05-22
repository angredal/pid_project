package dictionaryservice.impl.domain.dao;

import dictionaryservice.impl.domain.entity.RatingScale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RatingScaleDao extends JpaRepository<RatingScale, UUID> {
}
