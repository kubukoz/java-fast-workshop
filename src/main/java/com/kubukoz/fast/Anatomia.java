/*pakiet*/
package com.kubukoz.fast;

/*importy*/

import java.util.Arrays;
import java.util.List;

//to jest komentarz jednoliniowy

/*
 to wieloliniowy
* */

/**
 * To komentarz dokumentacji - javadoc
 * @author kubukoz

 * Publiczna klasa
 * - tylko jedna w pliku
 * - jeśli plik ma być uruchamialny to musi mieć metodę main (jak niżej)
 */
public class Anatomia {
    //tu moga byc deklaracje zmiennych, ale statementy typu przypisanie już nie:
    int age = 19;

    int lel;

    //lel = 5; //błąd kompilacji


    //Statyczna i publiczna metoda main
    public static void main(String[] args) {
        //statementy

        //stała
        final List<Number> ints = Arrays.asList(1, 2, 3, 4);

        //pętla to też statement
        for (int i = 0; i < ints.size(); i++) {

            //zmienna
            int j = i + 1;
            System.out.println("Element: " + i + ", element + 1: " + j);
        }
    }
}

/*Inne klasy - o tym później*/