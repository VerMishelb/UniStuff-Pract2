package ru.mish.task4;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Shop.AddComputer("first pc");
        Shop.AddComputer("second pc");
        Shop.AddComputer("third pc");
        Shop.PrintComputers();
        Shop.RemoveComputer("second pc");
        System.out.println("Удалён \"second pc\"");
        Shop.PrintComputers();
        Shop.AddComputer();
        System.out.printf("second pc - %d элемент массива\n", Shop.FindComputer("third pc"));
        Shop.PrintComputers();
    }
}
