package com.leonardo.Rest.service;


import com.leonardo.Rest.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

@Service
public class DistanceService {
    @Autowired
    CityRepository cityRepository;

    public double distanceByPointsInMiles(Long city1, Long city2){
        return cityRepository.distanceByPoints(city1,city2);
    }

}
