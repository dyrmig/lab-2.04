package com.dyrmig.lab204_exeptions.main;

import com.dyrmig.lab204_exeptions.classes.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.dyrmig.lab204_exeptions.main.Main.clonePerson;
import static com.dyrmig.lab204_exeptions.main.Main.writePerson;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    public Person person;
    @BeforeEach
    void setUp() {
        person = new Person(11, "Pepe Gomez",22, "occupation");
    }

    @Test
    void clone_Person_Person() {
        Person clonedPerson = clonePerson(person);
        assertEquals(person, clonedPerson);
    }
    @Test
    void writePerson_nullPerson_IllegalArgumentException(){
        person = null;
        assertThrows(IllegalArgumentException.class, () -> writePerson(person));
    }
}