package com.pawel;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class KolekcjeMain {
    public static void main(String[] args) {
        //list
        System.out.println("lista");
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(30);
        System.out.println(lista);
        System.out.println(lista.size());
        lista.remove(0);
        System.out.println(lista);
        lista.add(0, 10);
        System.out.println(lista);
        lista.isEmpty();

        //set
        System.out.println("set");
        // wstawienie w dowolny sposob
//        Set<Integer> set = new HashSet<>();
        // wstawienie w kolejności
        Set<Integer> set = new LinkedHashSet<>();
        // posortowane w trakcie wstawiania
//        Set<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(20);
        set.add(10);
        set.add(10);
        set.add(20);
        System.out.println(set);
        set.isEmpty();
    }
}
