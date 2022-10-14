package ru.mish.task5;

public class Dog {
    Dog() {
        name = "-";
        age = 0;
    }
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public float getAge() {
        return age;
    }
    public float getHumanAge() {
        return age * 7;
    }

    public void setAge(float _age) {
        this.age = _age;
    }

    @Override
    public String toString() {
        return "Имя собаки: " + name + ", возраст: " + age;
    }

    private String name;
    private float age;
}
