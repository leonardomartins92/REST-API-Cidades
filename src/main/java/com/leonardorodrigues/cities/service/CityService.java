package com.leonardorodrigues.cities.service;

import com.leonardorodrigues.cities.model.City;
import com.leonardorodrigues.cities.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityService {
    @Autowired
    CityRepository cityRepository;

    public List<City> findAll(){
        return cityRepository.findAll();
    }
}
