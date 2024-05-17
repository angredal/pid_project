package dictionaryservice.impl.presentation.controller;


import api.dto.CountryDto;
import dictionaryservice.impl.application.facade.CountryFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/country")
@RequiredArgsConstructor
public class CountryController {
    private final CountryFacade countryFacade;

    @GetMapping("/{id}")
    public ResponseEntity<CountryDto> get(@PathVariable UUID id) {
        return new ResponseEntity<>(countryFacade.findById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<CountryDto>> getAll() {
        return new ResponseEntity<>(countryFacade.getAllCountries(), HttpStatus.OK);
    }
}
