package dictionaryservice.impl.application.facade;


import api.dto.CountryDto;
import dictionaryservice.impl.application.mapper.CountryMapper;
import dictionaryservice.impl.domain.service.CountryDomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CountryFacade {
    private final CountryDomainService countryDomainService;
    private final CountryMapper countryMapper;

    public CountryDto findById(UUID uuid) {
        return countryMapper.toCountryDto(countryDomainService.findById(uuid));
    }
    public List<CountryDto> getAllCountries() {
        return countryDomainService.getAllCountries().stream()
                .map(countryMapper::toCountryDto)
                .toList();
    }
}
