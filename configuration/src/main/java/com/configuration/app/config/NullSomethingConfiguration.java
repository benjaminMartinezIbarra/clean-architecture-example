package com.configuration.app.config;

import com.example.cleanarchitecture.service.SomethingProvider;
import com.example.cleanarchitecture.service.SomethingService;
import com.web.service.InboundService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("nothing")
public class NullSomethingConfiguration {

    //en production, on ferait référence a un provider d'un autre module
    //ici on utilise une lambda pour changer la configuration, mais ce n'est pas un code à garder en production.
    @Bean
    public SomethingProvider somethingProvider() {
        return () -> null;
    }

    @Bean
    public InboundService webService(SomethingService somethingService) {
        return new InboundService(somethingService);
    }
}
