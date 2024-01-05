package org.example.named;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private final List<Animal> animals = new ArrayList<>();

    @Inject
    public void addCat(@Named("cat") Animal cat) {
        animals.add(cat);
    }

    @Inject
    public void addDog(@Named("dog") Animal dog) {
        animals.add(dog);
    }

    public void makeNoises() {
        animals.forEach(Animal::makeSound);
    }
}