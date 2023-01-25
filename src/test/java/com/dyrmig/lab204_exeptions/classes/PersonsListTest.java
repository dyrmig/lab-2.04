package com.dyrmig.lab204_exeptions.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonsListTest {
    public PersonsList listaPersonas;
    @BeforeEach
    void setUp() {
        List<Person> lista = new ArrayList<>();
        lista.add(new Person(11, "Pepe Gomez",22, "occupation"));
        lista.add(new Person(12, "Alez Hernandez",33, "occupation"));
        lista.add(new Person(13, "Lolo Perez",44, "occupation"));
        listaPersonas = new PersonsList(lista);
    }

    @Test
    void findByName_StringSpaceString_findName() {
        assertEquals("Pepe Gomez",listaPersonas.findByName("Pepe Gomez").getName());
    }
    @Test
    public void findByName_noSpacesString_IllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, () -> listaPersonas.findByName("PepeGomez"));
    }

}