package com.leonardo.Rest.service;

import com.leonardo.Rest.model.State;
import com.leonardo.Rest.repository.StateRepository;
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
