package com.leonardorodrigues.cities.controller;

import com.leonardorodrigues.cities.model.Country;

import com.leonardorodrigues.cities.repository.CountryRepository;
import com.leonardorodrigues.cities.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    CountryService countryService;

    @GetMapping
    public Page<Country> getAllCountries(Pageable page){
        return countryService.findAll(page);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity getById(@PathVariable Long id){
        try{
            return ResponseEntity.ok().body(countryService.findById(id));
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}
