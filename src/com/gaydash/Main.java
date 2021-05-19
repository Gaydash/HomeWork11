package com.gaydash;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> list = ListPerson.generate100personsList();
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
