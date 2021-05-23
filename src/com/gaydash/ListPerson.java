package com.gaydash;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class ListPerson {

    private static int COUNT = 100;
    public static final String[] LAST_NAMES = new String[]{"Иванов", "Петров", "Сидоров", "Козаков", "Баранов"};
    public static final String[] FIRST_NAMES = new String[]{"Вася", "Петя", "Саша", "Кирилл", "Борис"};
    private static final Random RANDOM = new Random();

    public static Person generatePerson() {
        String firstName = FIRST_NAMES[RANDOM.nextInt(FIRST_NAMES.length)];
        String lastName = LAST_NAMES[RANDOM.nextInt(LAST_NAMES.length)];

        int age = RANDOM.nextInt(100);

        int weight;
        int height;

        if (age < 10) {
            weight = RANDOM.nextInt(20) + 3;
            height = RANDOM.nextInt(70) + 50;
        } else {
            weight = RANDOM.nextInt(100) + 30;
            height = RANDOM.nextInt(100) + 100;
        }

        return new Person(firstName, lastName, age, weight, height);
    }

    public static List<Person> generate100personsList() {
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < COUNT; i++) {
            result.add(generatePerson());
        }
        return result;
    }

    public static Set<Person> uniquePersonsList(List<Person> arg) {
        Set<Person> resultSet = new HashSet<>(arg);
        return resultSet;
    }

}
