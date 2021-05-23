package com.gaydash;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Person> list = ListPerson.generate100personsList();

        for (Person person : list) {
            System.out.println(person);
        }

        Set<Person> uniqueSet = ListPerson.uniquePersonsList(list);
        System.out.println(uniqueSet);
        System.out.println("Amount of persons with unique First Name + Last Name = " + uniqueSet.size());
    }
}
