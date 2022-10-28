package ru.mish.task9;

public class Card {
    Card() {
        value = 0;
        suit = 0;
    }

    Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }


    public void printCard() {
        System.out.printf("%s %s\n", card_val[this.value], card_suit[this.suit]);
    }


    public int value;
    public int suit;

    public static final int VALUES_AMOUNT = 13;
    public static final int SUITS_AMOUNT = 4;
    public static final String[] card_val = {"-", "A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    public static final String[] card_suit = {"крести","червы","буби","пики"};

    @Override
    public String toString() {
        return card_val[this.value] + " " + card_suit[suit];
    }
}
