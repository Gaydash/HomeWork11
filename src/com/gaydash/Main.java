package com.gaydash;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        String[] humanLastName = new String[]{"Иванов", "Петров", "Сидоров", "Козаков", "Баранов"};
        String[] humanFirstName = new String[]{"Вася", "Петя", "Саша", "Кирилл", "Борис"};

        ListPerson listPerson = new ListPerson();
        for (int i = 0; i < 99; i++) {
            int lastName = (int) Math.floor(Math.random() * humanLastName.length);
            int firstName = (int) Math.floor(Math.random() * humanFirstName.length);

            int age = RANDOM.nextInt(100);

            int weight;
            int height;

            if (age < 10) {
                weight = RANDOM.nextInt(20) + 3;
                height = RANDOM.nextInt(70) + 50;
            } else {
                weight = RANDOM.nextInt(100) + 20;
                height = RANDOM.nextInt(150) + 50;
            }

            listPerson.addHuman(new Person(humanFirstName[firstName], humanLastName[lastName],
                    age, weight, height));
        }

        System.out.println(listPerson.toString());
    }
}
