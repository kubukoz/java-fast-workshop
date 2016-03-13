package com.kubukoz.fast;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Klasy {
    public void main(String[] args) {

        Zwierze zwierze = new Zwierze();

        System.out.println(zwierze.hello());

        Pies pies = new Pies("pies", 10);

        System.out.println(pies.hello());

        Point a = new Point(800, 600);
        Point b = new Point(1000, 800);
        System.out.println(new Line(a, b).length());

        Point.origin();
    }
}

class Point {
    int x, y;

    //konstruktor
    public Point(int x, int y) {
        this.x = x;
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
    public int length() {
        return (int) sqrt(
                pow(b.y - a.y, 2) + pow(b.x - a.x, 2)
        );
    }
}

class Zwierze {
    String hello() {
        return "Hello from " + toString();
    }

    @Override
    public String toString() {
        return "Zwierze()";
    }
}

class Pies extends Zwierze {
    private String race;
    private int age;

    public Pies(String race, int age) {
        this.race = race;
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pies(race = " + race + ", age = " + age + ")";
    }
}