package dictionaryservice.impl.presentation.controller;


import api.dto.RatingScaleDto;
import dictionaryservice.impl.application.facade.RatingScaleFacade;
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
@RequestMapping("/rating-scale")
@RequiredArgsConstructor
public class RatingScaleController {

    private final RatingScaleFacade ratingScaleFacade;

    @GetMapping("/{id}")
    public ResponseEntity<RatingScaleDto> get(@PathVariable UUID id) {
        return new ResponseEntity<>(ratingScaleFacade.findById(id), HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<RatingScaleDto>> getAll() {
        return new ResponseEntity<>(ratingScaleFacade.findAll(), HttpStatus.OK);
    }
}
