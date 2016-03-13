package com.kubukoz.fast;

public class ModyfikacjeDostepu {

    //widoczne w klasie, pakiecie, rozszerzeniach i wszędzie indziej
    public int get1() {
        return 5;
    }

    //widoczne w klasie, pakiecie, rozszerzeniach
    protected int get4() {
        return 4;
    }

    //widoczne w: klasie, pakiecie
    int get2() {
        return 2;
    }

    //widoczne w klasie
    private int get3() {
        return 3;
    }
}