package com.example.cleanarchitecture.service;

import java.util.Optional;
import java.util.function.Function;

public class SomethingServiceImpl implements SomethingService {

    private final SomethingProvider somethingProvider;

    public SomethingServiceImpl(SomethingProvider somethingProvider) {
        this.somethingProvider = somethingProvider;
    }

    @Override
    public <T> T get(Function<Optional<Something>, T> presenter) {

        Optional<Something> somethingReceived = Optional.ofNullable(somethingProvider.get());

        return presenter.apply(somethingReceived);
    }
}
