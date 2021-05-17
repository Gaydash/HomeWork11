package com.gaydash;

public class Main {

    public static void main(String[] args) {

        String[] humanLastName = new String[]{"Иванов", "Петров", "Сидоров", "Козаков", "Баранов"};
        String[] humanFirstName = new String[]{"Вася", "Петя", "Саша", "Кирилл", "Борис"};

        ListPerson listPerson = new ListPerson();
        for (int i = 0; i < 99; i++) {
        int lastName = (int) Math.floor(Math.random() * humanLastName.length);
        int firstName = (int) Math.floor(Math.random() * humanFirstName.length);

        listPerson.addHuman(new Person(humanFirstName[firstName], humanLastName[lastName], (int)(20 + Math.random()*50)));
    }

 //       System.out.println(listPerson.getListPerson());
        System.out.println(listPerson.toString());
    }
}
