package com.dyrmig.lab204_exeptions.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    public Person person;

    @BeforeEach
    void setUp() {
        person = new Person(123, "Lala Lolo", 33, "programmer");
    }

    @Test
    public void setAge_positiveInt_changeAge(){
        person.setAge(3);
        assertEquals(3,person.getAge());
    }
    @Test
    public void setAge_negativeOrZero_IllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> person.setAge(-2));
    }

}