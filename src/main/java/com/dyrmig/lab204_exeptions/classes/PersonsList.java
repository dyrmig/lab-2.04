package com.dyrmig.lab204_exeptions.classes;

import java.util.List;

public class PersonsList {
    private List<Person> list;

    public PersonsList(List<Person> list) {
        this.list = list;
    }

    public Person findByName(String name){
        Person targetPerson = null;
        if(name.indexOf(" ") == -1){
            throw new IllegalArgumentException("Name format is incorrect");
        }
        for (Person person: list){
            if(name.equals(person.getName())){
                targetPerson = person;
            }
        }
        if(targetPerson == null){
            throw new IllegalArgumentException("Person not found");
        }
        return targetPerson;
    }

}
