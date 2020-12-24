package com.web.service;

import com.example.cleanarchitecture.service.Something;
import com.example.cleanarchitecture.service.SomethingService;

import java.util.Optional;
import java.util.function.Function;
import java.util.logging.Logger;

public class InboundService {

    private final SomethingService somethingService;

    private static final Logger inboundServiceLogger
            = Logger.getLogger(InboundService.class.getName());

    public InboundService(SomethingService somethingService) {
        this.somethingService = somethingService;
    }

    public void getSomething() {

        Function<Optional<Something>, String> presenter =
                (opt) -> opt.map(Something::toString)
                        .orElseGet(() -> "nothing to retrieve!");

        inboundServiceLogger.info(InboundService.class.getSimpleName() + " service calling for something");

        String myRepresentationOfSomething = somethingService.get(presenter);
        inboundServiceLogger.info(myRepresentationOfSomething);

    }
}
