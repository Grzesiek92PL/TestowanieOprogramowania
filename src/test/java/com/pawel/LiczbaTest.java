package com.pawel;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiczbaTest {

    private Liczba liczba;

    @BeforeEach
    void setup() {
        System.out.println("Uruchamiam BeforeEach");
        liczba = new Liczba();

    }

    @Test
    @DisplayName("prime number")
    void shouldBePrimeNumber() {
        //given
        int number = 7;
        //when
        boolean actual = liczba.czyPierwsza(number);
        //then
        assertThat(actual)
                .isTrue();
    }

    @Test
    @DisplayName("not a prime number")
    void shouldBeNotPrimeNumber() {
        //given
        int number = 8;
        //when
        boolean actual = liczba.czyPierwsza(number);
        //then
        assertThat(actual)
                .isFalse();
    }
}
