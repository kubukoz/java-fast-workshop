package com.kubukoz.fast;

import java.util.*;

public class TypyOgolne {
    public static void main(String[] args) {
        ogolneMessages();

        List<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");

        strings.get(0); //pierwszy element, itd
        //strings.get(3); //java.lang.IndexOutOfBoundsException

        strings.contains("aaa"); //na bazie equalsa argumentu funkcji

        Iterator<String> it = strings.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("asdf", 4);
        mapa.put("bsdf", 5);
        mapa.put("bsdf", 6);
        mapa.size(); //2 - unikalność kluczy
        mapa.get("asdf"); //jeśli nie ma - null. jeśli jest null - null
        mapa.getOrDefault("asdf", 10); //jeśli nie ma - 10
        mapa.keySet();
        mapa.values();
    }

    private static void ogolneMessages() {
        //dokładne
        StringMessage mess = new StringMessage("lel");
        //też dokładne
        Message<String> mess2 = new StringMessage("lel");
        //bardziej ogólne, ale nadal nienajgorsze
        Message<? extends CharSequence> mess3 = new StringMessage("lel");

        //najmniej dokładne
        Message mess4 = new StringMessage("lel");

        Message<Integer> mInt = new Message<Integer>(5);
    }
}

class Message<T> {
    private T message;

    public Message(T message) {
        this.message = message;
    }

    public T getMessage() {
        return message;
    }
}

class StringMessage extends Message<String> {
    public StringMessage(String message) {
        super(message);
    }

    /*@Override
    public String getMessage() {
        return super.getMessage();
    }*/
}