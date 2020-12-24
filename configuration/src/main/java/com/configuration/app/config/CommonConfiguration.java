package com.configuration.app.config;


import com.example.cleanarchitecture.service.SomethingProvider;
import com.example.cleanarchitecture.service.SomethingService;
import com.example.cleanarchitecture.service.SomethingServiceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfiguration {

    @Bean
    SomethingService somethingService(SomethingProvider somethingProvider){
        return new SomethingServiceImpl(somethingProvider);
    }
}
