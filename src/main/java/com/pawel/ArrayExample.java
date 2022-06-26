package com.pawel;

import java.util.HashSet;
import java.util.Set;

public class ArrayExample {
        Set<String> removeDuplicates(String[] tablica) {
            Set<String> result = new HashSet<>();
            for (String string : tablica) {
                result.add(string);
            }
            return result;
        }
    }

