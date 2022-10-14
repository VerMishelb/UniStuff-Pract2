package ru.mish.task3;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        addCircle(new Circle(10, 12));
        addCircle(new Circle());
        addCircle(new Circle(new Point(123, 456)));
        System.out.println(circles);
    }

    public static void addCircle(Circle nc) {
        circles.add(nc);
        circles_size = circles.size();
    }

    static public ArrayList<Circle> circles = new ArrayList<>();
    static public int circles_size = 0;
}
