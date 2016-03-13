package com.kubukoz.fast;

import java.util.Arrays;

public class PrzekazywanieDanych {
    public static void main(String[] args) {
        int[] liczby = {1, 2, 3};
        System.out.println("Before: " + Arrays.toString(liczby));
        zmienLiczbyNaZera(liczby);
        System.out.println("After: " + Arrays.toString(liczby));

        int a = 0;
        System.out.println("Before: " + a);
        probujZmienicLiczbe(a);
        System.out.println("After: " + a); //nadal 0

        String z = "lelele";
        System.out.println("Before: " + z);
        zmienStringa(z);
        System.out.println("After: " + z); //nie zmieni się - String jest immutable

        Square square = new Square(10);
        System.out.println("Before: " + square/*.toString()*/);
        zmienSquare(square);
        System.out.println("After: " + square);
        square.a = 10;
        System.out.println("Again: " + square);

        System.out.println(new ImmutableSquare(10).getA());
    }

    private static void zmienSquare(Square square) {
        square.setA(200);
    }

    private static void zmienStringa(String z) {
        z = "xd";
    }

    private static void probujZmienicLiczbe(int a) {
        a = 1;
    }

    private static void zmienLiczbyNaZera(int[] liczby) {
        for (int i = 0; i < liczby.length; i++)
            liczby[i] = 0;
    }
}

class Square {
    int a;

    @Override
    public String toString() {
        return "Square(a = " + a + ")";
    }

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class ImmutableSquare {
    private /*final */ int a;

    public ImmutableSquare(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImmutableSquare that = (ImmutableSquare) o;

        return a == that.a;
    }

    @Override
    public int hashCode() {
        return a;
    }
}
