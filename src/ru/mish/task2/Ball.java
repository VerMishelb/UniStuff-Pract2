package ru.mish.task2;

class Ball {

    //Public
    Ball() {
        x = 0.0;
        y = 0.0;
    }
    Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    @Override public String toString() {
        return "(" + x + ", " + y + ")";
    }

    //Private
    double x, y;
}
