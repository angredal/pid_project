package dictionaryservice.impl.application.mapper;


import api.dto.CountryDto;
import dictionaryservice.impl.domain.entity.Country;
import org.mapstruct.Mapper;

@Mapper
public interface CountryMapper {
    Country toCountry (CountryDto countryDto);
    CountryDto toCountryDto (Country country);

}
