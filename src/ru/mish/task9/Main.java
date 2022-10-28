package ru.mish.task9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введмте количество игроков: ");
        int n = sc.nextInt();

        Card[] stock = new Card[Card.SUITS_AMOUNT * Card.VALUES_AMOUNT];
        ArrayList<Integer> available_cards = new ArrayList<>(Card.SUITS_AMOUNT * Card.VALUES_AMOUNT);

        for (int suit = 0; suit < Card.SUITS_AMOUNT; ++suit) {
            for (int val = 0; val < Card.VALUES_AMOUNT; ++val) {
                stock[(suit*Card.VALUES_AMOUNT) + val] = new Card(val+1, suit);

            }
        }

        for (int i = 0; i < Card.SUITS_AMOUNT * Card.VALUES_AMOUNT; ++i) {
            available_cards.add(i);
        }

//        for (int i = 0; i < stock.length; ++i) {
//            System.out.println(stock[i]);
//        }
        Random rand = new Random();

        JUMP_OUT:
        for (int players = 0; players < n; ++players) {
            for (int cards = 0; cards < 5; ++cards) {
                Card next_card;
                int idx;
                if (available_cards.size() > 0) {
                    idx = rand.nextInt(available_cards.size());
                    next_card = stock[available_cards.get(idx)];
                } else {
                    break JUMP_OUT;
                }
                System.out.println(next_card);
                available_cards.remove(idx);
            }
            System.out.println("\n");
        }
        System.out.println("Карты разданы.");

    }


}
