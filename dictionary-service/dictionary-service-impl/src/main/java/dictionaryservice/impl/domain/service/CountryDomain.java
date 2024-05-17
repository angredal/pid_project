package dictionaryservice.impl.domain.service;


import dictionaryservice.impl.domain.dao.CountryDao;
import dictionaryservice.impl.domain.entity.Country;
import jakarta.annotation.Nullable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CountryDomain {
    private final CountryDao countryDao;


    @Nullable
    public Country findById(UUID uuid) {
        return countryDao.findById(uuid).orElse(null);
    }

    public List<Country> getAllCountries() {
        return countryDao.findAll();
    }

}
