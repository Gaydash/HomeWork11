package com.gaydash;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String[] humanLastName = new String[]{"Иванов", "Петров", "Сидоров", "Козаков", "Баранов"};
        String[] humanFirstName = new String[]{"Вася", "Петя", "Саша", "Кирилл", "Борис"};

        ListPerson listPerson = new ListPerson();
        for (int i = 0; i < 10; i++) {
        int lastName = (int) Math.floor(Math.random() * humanLastName.length);
   //         System.out.println(lastName);
        int firstName = (int) Math.floor(Math.random() * humanFirstName.length);
   //         System.out.println(firstName);

        listPerson.addHuman(new Person(humanFirstName[firstName], humanLastName[lastName], 178.1));
    }

        System.out.println(listPerson);
       // System.out.println(Arrays.toString(listPerson.toArray()));
       // for (int i = 0; i < 10; i++) {
       //     System.out.println(listPerson.get(i));
    }
}
