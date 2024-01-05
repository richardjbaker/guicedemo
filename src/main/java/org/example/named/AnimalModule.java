package org.example.named;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;

public class AnimalModule extends AbstractModule {
    @Override
    protected void configure() {
        /*
            all done below using @Provides
            or could be done here with:
            bind(Animal.class).annotatedWith(Names.named("cat")).to(Cat.class);
            bind(Animal.class).annotatedWith(Names.named("dog")).to(Dog.class);
         */
    }

    @Provides
    @Named("cat")
    public Animal provideCat() {
        return new Cat();
    }

    @Provides
    @Named("dog")
    public Animal provideDog() {
        return new Dog();
    }
}
