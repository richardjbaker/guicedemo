package org.example.named;

import com.google.inject.Guice;
import com.google.inject.Injector;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AnimalModule());
        Shelter shelter = injector.getInstance(Shelter.class);
        shelter.makeNoises();
        injector.getAllBindings().forEach((key, value) -> log.info("{} -> {}", key, value));
    }
}
