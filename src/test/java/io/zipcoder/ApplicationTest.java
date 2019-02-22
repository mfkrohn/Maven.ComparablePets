package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ApplicationTest {

    @Test
    public void howManyPetsTest(){
        //Given
        Pet cat1 = new Cat("Snuggles");
        Pet dog1 = new Dog("BigDog");
        Pet dino1 = new Dinosaur("Meatasaurus");
        List<Pet> myPets = new ArrayList<Pet>();
        myPets.add(cat1);
        myPets.add(dog1);
        myPets.add(dino1);
        Integer expected = 3;

        //When
        Integer actual = myPets.getNumberOfPets();

        //Then
        Assert.assertEquals(expected, actual);
    }


}
