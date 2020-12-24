package com.configuration.app;

import com.web.service.InboundService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageLauncher implements CommandLineRunner {

    private final InboundService inboundService;

    public MessageLauncher(InboundService inboundService) {
        this.inboundService = inboundService;
    }

    @Override
    public void run(String... args) throws Exception {

        inboundService.getSomething();
    }
}
