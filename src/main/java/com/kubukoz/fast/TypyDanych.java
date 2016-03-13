package com.kubukoz.fast;

import java.util.*;

public class TypyDanych {
    public static void main(String[] args) {
        int num = 5;
        float numF = 10.0f;
        double numD = 20.0d; //albo 20.0


        //operatory praktycznie jak w C:
        int suma = 3 + 4;
        int mult = 3 * 4;
        int modulo = 6 % 4;

        long lel = 1000000000000000L;
        double dzielenieCalk = 5 / 2; //2.0
        double dzieleniePrzec = 5 / 2.0; //2.5

        /*wartości logiczne*/
        boolean T = true;
        boolean F = false;
        boolean or = T || F; //true
        boolean and = T && F; //false

        String name = "hello world!";
        System.out.println(name.length()); //12
        String nameWithNumber = name + " " + 19; //hello world 19
        String twoStrings = "hello " + "world";



        /*
        * Klasa z której dziedziczy każda inna.
        * Definiuje trochę ciekawego stuffu.
        */
        Object o = "wrzucam stringa, bo moge";



        //tablica o stałym rozmiarze
        int[] liczby = {1, 2, 3, 4};

        /*
         * jeśli inicjalizacja tablicy, listy, obiektu się nie powiedzie
         * czyli tak jak w C dostalibyśmy NULL na mallocu
         * to w javie dostaniemy error - o tym później
         *
         * oprócz errorów są jeszcze wyjątki, też później
         * */

        System.out.println(liczby.length); //4 :D

        liczby[3] = 5; //można zmieniać tablicę


        //wywali się
        liczby[5] = 3; //nie można zmieniać ich rozmiaru - tu dostaniemy wyjątek.

        System.out.println(Arrays.toString(liczby));

        Object x = liczby; //tablice to też obiekty

//        char[] toNieDziała = "c to męczarnia";

        String[] stringi = {"yolo", "swag"};


        List<String> listaStringow = Arrays.asList("a", "bbb");

        List<String> drugaListaStringow = new ArrayList<>();
        drugaListaStringow.add("asdf");
        drugaListaStringow.add("asdf");
        drugaListaStringow.add("bsdf");
        drugaListaStringow.add("csdf");
        drugaListaStringow.add("yolo");

        System.out.println(drugaListaStringow.size()); //5

        Set<String> zestawString = new HashSet<>();
        zestawString.add("hello");
        zestawString.add("world");
        zestawString.add("hello");
        System.out.println(zestawString.size()); // 2

        //w przypadku hashsetów na podstawie hashCode
    }
}
