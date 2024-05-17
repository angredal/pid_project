package dictionaryservice.impl.domain.dao;

import dictionaryservice.impl.domain.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CountryDao extends JpaRepository<Country, UUID> {
}
