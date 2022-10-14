package ru.mish.task6;

public class Circle {
    Circle() {
        x = 0;
        y = 0;
        r = 0;
    }
    Circle(float x, float y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getArea() {
        return Pi * r * r;
    }

    public float getLength() {
        return 2 * Pi * r;
    }

    public boolean largerThan(Circle other) {
        return (this.r > other.r);
    }

    public boolean smallerThan(Circle other) {
        return (this.r < other.r);
    }

    @Override public boolean equals(Object obj) {
        if (obj == this) {return true;}
        if (obj == null || obj.getClass() != this.getClass()) { return false; }

        Circle cr = (Circle)obj;
        return (this.r == cr.r);
    }

    private float x, y, r;
    public final float Pi = 3.14159265f;
}
