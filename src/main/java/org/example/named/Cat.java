package org.example.named;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cat implements Animal {
    @Override
    public void makeSound() {
        log.info("Meow");
    }
}
