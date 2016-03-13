package com.kubukoz.fast;

import java.io.IOException;

public class Wyjatki {
    public static void main(String[] args) {
        niebezpiecznySyf(5);

        try {
            niebezpiecznySyfIO(5);
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            //robimy coś, niezależnie od tego czy się udało czy nie - np. zamykamy pliki, połączenia itd
        }

    }

    private static int niebezpiecznySyf(int i) {
        if (i > 10) return i;
        else {
            //dziedziczy z RuntimeException więc nie deklarujemy
            throw new IllegalArgumentException("i musi być > 10");
        }
    }

    private static int niebezpiecznySyfIO(int i) throws IOException {
        if (i > 10) return i;
        else throw new IOException("i musi być > 10");
    }
}
