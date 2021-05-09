package com.leonardo.Rest.controller;


import com.leonardo.Rest.model.State;
import com.leonardo.Rest.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/staties")
public class StateController {
    @Autowired
    StateService stateService;

    @GetMapping
    public List<State> getAllStaties(){
        return stateService.findAll();
    }
}
