package dictionaryservice.impl.application.facade;


import api.dto.CountryDto;
import dictionaryservice.impl.application.mapper.CountryMapper;
import dictionaryservice.impl.domain.service.CountryDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CountryFacade {
    private final CountryDomain countryDomain;
    private final CountryMapper countryMapper;

    public CountryDto findById(UUID uuid) {
        return countryMapper.toCountryDto(countryDomain.findById(uuid));
    }
    public List<CountryDto> getAllCountries() {
        return countryDomain.getAllCountries().stream()
                .map(countryMapper::toCountryDto)
                .toList();
    }
}
