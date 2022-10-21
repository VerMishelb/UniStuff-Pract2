package ru.mish.task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введмте количество игроков: ");
        int n = sc.nextInt();

        int stock[][] = new int[4][13];
        int stock_size[] = new int[4];
        for (int i = 0; i < 4; ++i) {
            stock_size[i] = 13;
            for (int j = 0; j < 13; ++j) {
                stock[i][j] = j+1;
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int c = 0; c < 5; ++c) {

            }
        }

    }

    public static final String[] card_val = {"-", "A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public static final String[] card_suit = {"крести","червы","буби","пики"};
}
