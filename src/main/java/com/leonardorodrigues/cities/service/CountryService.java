package com.leonardorodrigues.cities.service;

import com.leonardorodrigues.cities.model.Country;
import com.leonardorodrigues.cities.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    CountryRepository countryRepository;

    public Country findById(Long id) {
        return countryRepository.findById(id).get();
    }

    public List<Country> findAll(){
        return countryRepository.findAll();
    }

    public Page<Country> findAll(Pageable page){
        return countryRepository.findAll(page);
    }
}
