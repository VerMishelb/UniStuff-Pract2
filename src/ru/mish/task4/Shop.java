package ru.mish.task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void AddComputer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите название компьютера: ");
        String val = sc.nextLine();
        _computers.add(val);
    }

    public static void AddComputer(String name) {
        _computers.add(name);
    }

    public static void RemoveComputer(String name) {
        _computers.remove(FindComputer(name));
    }
    public static int FindComputer(String name) {
        return _computers.indexOf(name);
    }

    public static void PrintComputers() {
        System.out.println("Компьютеры:");
        for (String pc : _computers) {
            System.out.println("\t" + pc);
        }
    }
    private static ArrayList<String> _computers = new ArrayList<>();
}
