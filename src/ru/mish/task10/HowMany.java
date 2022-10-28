package ru.mish.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложения:");
        int counter = 0;
        String text = sc.nextLine();

        sc = new Scanner(text);
        while (sc.hasNext()) {
            sc.next();
            ++counter;
        }
        System.out.println(counter);
    }
}
