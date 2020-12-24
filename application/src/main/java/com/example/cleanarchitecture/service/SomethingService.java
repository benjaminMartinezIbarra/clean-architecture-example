package com.example.cleanarchitecture.service;

import java.util.Optional;
import java.util.function.Function;

public interface SomethingService {

    <T> T get(Function<Optional<Something>, T> presenter );
}
