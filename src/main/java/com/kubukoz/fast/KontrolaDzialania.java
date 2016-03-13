package com.kubukoz.fast;

public class KontrolaDzialania {
    public static void main(String[] args) {

        boolean x = 5 % 2 == 1;

        if (x) {
            System.out.println("5 % 2 == 1");
        } else if (true) {
            System.out.println("???");
        } else {
            System.out.println("lel");
        }

        int i = 0;

        while (i < 100) {
            System.out.println(i);
            i++;
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

        int[] ms = /*new int[]*/{1,2,3};
        //tzw. foreach
        for(int m : ms){
            System.out.println(m);
        }
    }
}
