package ru.mish.task6;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 =  new Circle(5, 10, 15);
        Circle c2 =  new Circle(25, 8, 10);
        System.out.printf(
                "c1\n\tArea: %f\n\tLength: %f\n" +
                "c2\n\tArea: %f\n\tLength: %f\n",
                c1.getArea(), c1.getLength(),
                c2.getArea(), c2.getLength()
        );

        System.out.println(c1.equals(c2));
        Circle c3 = new Circle(1, 2, 15);
        System.out.println(c1.equals(c3));
    }
}
