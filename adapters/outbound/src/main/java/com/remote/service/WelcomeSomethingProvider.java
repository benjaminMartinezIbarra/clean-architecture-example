package com.remote.service;

import com.example.cleanarchitecture.service.SomethingProvider;
import com.example.cleanarchitecture.service.Something;

public class WelcomeSomethingProvider implements SomethingProvider {

    @Override
    public Something get() {
        return new Something() {
            @Override
            public String toString() {
                return "this is a welcome thing from "
                        + WelcomeSomethingProvider.class.getSimpleName();
            }
        };
    }
}
