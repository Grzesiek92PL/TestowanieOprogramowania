package com.pawel;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Lotto {
        Set<Integer> losuj(int x, int min, int max) {
            Set<Integer> result = new TreeSet<>();
            Random random = new Random();
            while (result.size() != x) {
                result.add(ThreadLocalRandom.current().nextInt(min, max + 1));
            }
            return result;
        }

        public static void main(String[] args) {
            Lotto lotto = new Lotto();
            Set<Integer> results = lotto.losuj(6, 1, 49);
            System.out.println(results);
        }
    }

