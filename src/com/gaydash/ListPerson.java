package com.gaydash;

import java.util.ArrayList;
import java.util.List;

public class ListPerson {

    private List<Person> listPerson = new ArrayList<>();

    public void addHuman(Person human) {
        listPerson.add(human);
    }

    public List<Person> getListPerson() {
        return listPerson;
    }

    @Override
    public String toString() {
        return "ListPerson{" +
                "listPerson=" + listPerson +
                +'}' + "\n";
    }
}
