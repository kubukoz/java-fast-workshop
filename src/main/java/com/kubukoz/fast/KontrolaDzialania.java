package com.kubukoz.fast;

import java.util.Arrays;
import java.util.List;

public class KontrolaDzialania {
    public static void main(String[] args) {

        List<String> xxx = Arrays.asList("asdf", "basd");
        List<String> yyy = Arrays.asList("asdf", "basd");

        System.out.println(xxx.equals(yyy));

        boolean x = 5 % 2 == 1;

        if (x) {
            System.out.println("5 % 2 == 1");
        } else if (x) {
            System.out.println("???");
        } else {
            System.out.println("lel");
        }

        int a = 5;

        switch(a){
            case 1:
                System.out.println("1!");
                break;
            case 2:
                System.out.printf("2!");
                break;
            default:
                System.out.println("Coś innego");
                break;
        }

        int i = 0;

        while (i < 100) {
            System.out.println(i++);
        }

        for (int j = 0; j < 10; j++) {
            System.out.println("j: " + j);
        }


        int z = 5 == 2 ? 1 : 0;

        int k = 1;

        do {
            System.out.println("k: " + k);
            k++;
        } while (k < 0);

        int[] ms = /*new int[]*/{1, 2, 3};

        //tzw. foreach
        for (int m : ms) {
            System.out.println(m);
        }
    }
}
