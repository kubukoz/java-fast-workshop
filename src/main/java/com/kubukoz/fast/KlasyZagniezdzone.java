package com.kubukoz.fast;

public class KlasyZagniezdzone {
    public static void main(String[] args) {

        new A().new NestedA();

        new A.NestedStaticA();

        //np.


        Person person = new Person.Builder()
                .withAge(18)
                .withName("lel")
                .build();

        new Dog("A").new Food().eat();
        new Dog("B").new Food().eat();
    }

}

class A {
    class NestedA {
    }

    static class NestedStaticA {
    }
}


class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    class Food {
        public void eat() {
            System.out.println("destroyed food of dog " + Dog.this.toString());
        }
    }
}

class Person {
    int age;
    String name;

    static class Builder {
        Person p = new Person();

        Builder withAge(int age) {
            p.age = age;
            return this;
        }

        Builder withName(String name) {
            p.name = name;
            return this;
        }

        Person build() {
            return p;
        }
    }
}