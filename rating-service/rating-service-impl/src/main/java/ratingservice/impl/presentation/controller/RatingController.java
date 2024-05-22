package ratingservice.impl.presentation.controller;


import api.RatingDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ratingservice.impl.application.facade.RatingFacade;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/rating")
@RequiredArgsConstructor
public class RatingController {
    private final RatingFacade ratingFacade;

    @GetMapping("/{id}")
    public ResponseEntity<RatingDto> get(@PathVariable UUID id){
        return new ResponseEntity<>(ratingFacade.findById(id), HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<RatingDto>> getAll(){
        return new ResponseEntity<>(ratingFacade.findAll(), HttpStatus.OK);
    }
}
