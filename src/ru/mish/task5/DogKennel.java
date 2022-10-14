package ru.mish.task5;

import java.util.ArrayList;

class DogKennel {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Prima", 3);
        Dog dog2 = new Dog("Dwayne", 7);
        Dog dog3 = new Dog("Tertia", 1);
        AddDog(dog1);
        AddDog(dog2);
        AddDog(dog3);
        for (int i = 0; i < dogs.size(); ++i) {
            System.out.println(dogs.get(i));
            System.out.printf("\"Человеческий\" возраст: %.1f\n", dogs.get(i).getHumanAge());
        }
    }

    public static void AddDog(Dog dog) {
        dogs.add(dog);
    }

    static ArrayList<Dog> dogs = new ArrayList<>();
}
