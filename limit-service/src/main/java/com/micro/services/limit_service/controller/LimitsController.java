package com.micro.services.limit_service.controller;

import com.micro.services.limit_service.bean.Limits;
import com.micro.services.limit_service.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping(path = "/limits")
    public Limits retriveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
