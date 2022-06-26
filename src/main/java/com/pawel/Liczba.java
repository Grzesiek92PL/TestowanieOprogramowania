package com.pawel;

public class Liczba {

    public boolean czyPierwsza(int number) {

        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;

            }
        }
        return true;
    }
}
