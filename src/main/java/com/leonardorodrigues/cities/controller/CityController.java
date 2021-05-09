package com.leonardorodrigues.cities.controller;

import com.leonardorodrigues.cities.model.City;

import com.leonardorodrigues.cities.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cities")
public class CityController {
    @Autowired
    CityService cityService;

    @GetMapping
    public List<City> getAllCities(){
         return cityService.findAll();
    }


}
