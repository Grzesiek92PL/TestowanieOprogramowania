package com.pawel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    @DisplayName("Adding two numbers")
    void shouldAddTwoNumbers() {
        //given
        double firstNumber = 11;
        double secondNumber =20;
        //when
        double actual = Calculator.add(firstNumber, secondNumber);
        //then
        double expected =31;
        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("Subtraction of two numbers")
    void shouldSubtractTwoNumbers() {
        //given
        double firstNumber = 11;
        double secondNumber =20;
        //when
        double actual = Calculator.subtraction(firstNumber, secondNumber);
        //then
        double expected =-9;
        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("Multiplication of two numbers")
    void shouldMultiplyToNumbers() {
        //given
        double firstNumber = 11;
        double secondNumber =20;
        //when
        double actual = Calculator.multiplication(firstNumber, secondNumber);
        //then
        double expected =220;
        assertEquals(expected,actual);

    }

    @Test
    @DisplayName("Dividing of two numbers")
    void shouldDivideToNumbers() {
        //given
        double firstNumber = 40;
        double secondNumber =20;
        //when
        double actual = Calculator.division(firstNumber, secondNumber);
        //then
        double expected =2;
        assertEquals(expected,actual); //junit
        assertThat(actual).isEqualTo(expected); //assertJ

    }
}