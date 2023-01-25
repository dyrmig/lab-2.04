package com.dyrmig.lab204_exeptions.main;

import com.dyrmig.lab204_exeptions.classes.Person;
import com.dyrmig.lab204_exeptions.classes.PersonsList;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person(11, "Pepe Gomez",22, "occupation");
        Person person2 = new Person(12, "Alez Hernandez",33, "occupation");
        Person person3 = new Person(13, "Lolo Perez",44, "occupation");

        List<Person> lista = new ArrayList<>();
        lista.add(person1);
        lista.add(person2);
        lista.add(person3);
        PersonsList listaPersonas = new PersonsList(lista);

        System.out.println(listaPersonas.findByName("Pepe Gomez"));

        Person clonedPerson1 = clonePerson(person1);
        System.out.println(clonedPerson1);

        writePerson(person2);
        writePerson(person3);
    }
    public static Person clonePerson(Person person){
        Person clonePerson = new Person((int)Math.floor(Math.random()*(9999 - 1000 + 1) + 1000),person.getName(), person.getAge(),person.getOccupation());
        return clonePerson;
    }
    public static void writePerson(Person person) throws IOException {

        FileWriter writer = new FileWriter("personlist.txt", true);
        writer.write(person.toString()+"\n");
        writer.close();
    }
}
