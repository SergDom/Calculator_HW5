package com.example.calculator_hw5.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {
    Operations operations;

    @BeforeEach
    void setUp() {
        operations = new Operations();
    }
    @Test
    void fivePlusFiveShouldEqualTen() {
        assertEquals(10, operations.sum(5,5));
    }
    @Test
    void sumDontHaveFirstArgument() {
        assertThrows(IllegalArgumentException.class, () -> {
            operations.sum(null, 5);});
    }
    @Test
    void sumDontHaveSecondArgument() {
        assertThrows(IllegalArgumentException.class, () -> {
            operations.sum(5, null);});
    }

    @Test
    void tenMinusFiveShouldEqualFive() {
        assertEquals(5, operations.subtraction(10,5));
    }

    @Test
    void subtractionDontHaveFirstArgument() {
        assertThrows(IllegalArgumentException.class, () -> {
            operations.subtraction(null, 5);});
    }
    @Test
    void subtractionDontHaveSecondArgument() {
        assertThrows(IllegalArgumentException.class, () -> {
            operations.subtraction(5, null);});
    }

    @Test
    void fiveMultiplyFiveShouldEqualTweintyfive() {
        assertEquals(25, operations.multiply(5,5));
    }
    @Test
    void multiplyDontHaveFirstArgument() {
        assertThrows(IllegalArgumentException.class, ()->{operations.multiply(null,10);});
    }
    @Test
    void multiplyDontHaveSecondArgument() {
        assertThrows(IllegalArgumentException.class, ()->{operations.multiply(10,null);});
    }

    @Test
    void sixDivideTwoShouldEqualThree() {
        assertEquals(3, operations.divide(6,2));
    }
    @Test
    void divideDontHaveFirstArgument() {
        assertThrows(IllegalArgumentException.class, ()->{operations.divide(null,5);});
    }

    @Test
    void divideToNullShouldReturnException() {
     assertThrows(IllegalArgumentException.class, ()->{operations.divide(25,0);});
    }
}