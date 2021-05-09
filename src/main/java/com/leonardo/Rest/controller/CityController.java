package com.leonardo.Rest.controller;


import com.leonardo.Rest.model.City;
import com.leonardo.Rest.service.CityService;
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
