package ru.mish.task3;

public class Circle {
    Circle() {
        centre = new Point(0, 0);
    }
    Circle(Point pos) {
        centre = pos;
    }
    Circle(double x, double y) {
        centre = new Point(x, y);
    }

    public void setCentre(Point pos) {
        centre = pos;
    }

    @Override public String toString() {
        return "Circle(" + centre + ")";
    }

    Point centre;
}
