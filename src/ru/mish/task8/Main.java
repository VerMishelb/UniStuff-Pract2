package ru.mish.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr_s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Размер массива: ");
        arr_s = sc.nextInt();
        int[] arr = new int[arr_s];
        System.out.print("Введите элементы: ");
        for (int i = 0; i < arr_s; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr_s; ++i) {
            System.out.printf("%d ", arr[i]);
        }

        for (int i = 0; i < arr_s / 2; ++i) {
            int t = arr[i];
            arr[i] = arr[arr_s - i - 1];
            arr[arr_s - i - 1] = t;
        }
        System.out.print("\n");
        for (int i = 0; i < arr_s; ++i) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
