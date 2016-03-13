package com.kubukoz.fast;

public class InterfejsyAbstrakcje {
    public static void main(String[] args) {
        // Edible e1 = new Edible(); nie wejdzie
        Edible e2 = new Edible() {
            @Override
            public int getWeight() {
                return 0;
            }
        };


        Animal c = new Animal() {
            @Override
            String name() {
                return "Coś";
            }
        };
    }
}

interface As {
}

interface Bs {
}

abstract class AB2 implements As, Bs {

}

interface AB extends As, Bs {
}

interface Edible {
    public int getWeight();

    /*w javie 8
    default void zaimplementowana(){
        System.out.println("lel");
    }
    */
}

interface HasName {
    public String getName();
}

class Food implements Edible {
    @Override
    public int getWeight() {
        return 10;
    }
}

class AdvancedFood implements Edible, HasName {

    @Override
    public String getName() {
        return "Advanced Food";
    }

    @Override
    public int getWeight() {
        return 100;
    }
}

abstract class Animal {
    abstract String name();
}

class Cat extends Animal {
    @Override
    String name() {
        return "A cat!";
    }
}