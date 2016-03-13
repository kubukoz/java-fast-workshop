package com.kubukoz.fast;

import java.util.Arrays;
import java.util.List;

public class AnatomiaPlain {
    int age = 19;

    int lel;

    public static void main(String[] args) {
        final List<Integer> ints = Arrays.asList(1, 2, 3, 4);

        for (int i = 0; i < ints.size(); i++) {
            int j = i + 1;
            System.out.println("Element: " + i + ", element + 1: " + j);
        }
    }
}