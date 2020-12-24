package com.configuration.app.config;

import com.example.cleanarchitecture.service.SomethingProvider;
import com.example.cleanarchitecture.service.SomethingService;
import com.remote.service.WelcomeSomethingProvider;
import com.web.service.InboundService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!nothing")
public class DoSomethingConfiguration {

    @Bean
    public SomethingProvider somethingProvider() {
        return new
                WelcomeSomethingProvider(); }

    @Bean
    public InboundService webService(SomethingService somethingService) {
        return new InboundService(somethingService);
    }
}
