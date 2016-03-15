package com.kubukoz.fast;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Klasy {
    public static void main(String[] args) {

        Zwierze zwierze = new Zwierze();

        System.out.println(zwierze.hello());

        Zwierze pies = new Pies("pies", 10);

        System.out.println(pies.hello());

        Point a = new Point(800, 600);
        Point b = new Point(1000, 800);

        Point c = Point.origin();

        System.out.println(new Line(a, b).length());

    }
}

class Point {
    int x, y;

    //konstruktor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static Point origin() {
        return new Point(0, 0);
    }
}

class Line {
    Point a, b;

    //konstruktor
    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    //metoda
    public double length() {
        return sqrt(pow(b.y - a.y, 2) + pow(b.x - a.x, 2));
    }
}

class Zwierze {
    String hello() {
        return "Hello from " + toString();
    }

    @Override
    public String toString() {
        return "Zwierze";
    }
}

class Pies extends Zwierze {
    private final String race;
    private final int age;

    public Pies(String race, int age) {
        this.race = race;
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Pies(race = " + race + ", age = " + age + ")";
    }

}