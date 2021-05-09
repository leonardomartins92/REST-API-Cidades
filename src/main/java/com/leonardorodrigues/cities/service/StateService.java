package com.leonardorodrigues.cities.service;

import com.leonardorodrigues.cities.model.State;
import com.leonardorodrigues.cities.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {
    @Autowired
    StateRepository stateRepository;

    public List<State> findAll(){
        return stateRepository.findAll();
    }
}
