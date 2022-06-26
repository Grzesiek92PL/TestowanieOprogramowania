package com.pawel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PeselTest {
    private static Pesel pesel;

    @BeforeEach
    void setup() {
        pesel = new Pesel();
    }

    @Test
    @DisplayName("valid pesel")
    void shouldBeValidPesel() {
        //given
        String myPesel = "44051401458";
        //when
        boolean actual = pesel.checkPesel(myPesel);

        //then
        assertThat(actual).isTrue();
    }

    @Test
    @DisplayName("invalid pesel")
    void shouldBeInvalidPesel() {
        //given
        String myPesel = "44051401458";
        //when
        boolean actual = pesel.checkPesel(myPesel);

        //then
        assertThat(actual).isFalse();
    }
    @ParameterizedTest(name = " Testujemy {0}")
    @ValueSource(strings = {"341423423","fdfdfdf","423423423423423",""})
    void shouldBeInvalidPesel(String input) {
        //given
        //when
        boolean actual = pesel.checkPesel(input);

        //then
        assertThat(actual).isFalse();
    }
}