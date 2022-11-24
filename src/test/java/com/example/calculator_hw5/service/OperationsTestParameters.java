package com.example.calculator_hw5.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTestParameters {
    Operations operations;

    @BeforeEach
    void setUp() {
        operations = new Operations();
    }

    public static Stream<Arguments> provideParamsForSum() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(3, -3, 0),
                Arguments.of(8, 2, 10)
        );
    }

    @ParameterizedTest
    @MethodSource ("provideParamsForSum")
    public void methodCalculateCorrectSum(Integer num1, Integer num2, Integer sum) {
        assertEquals(sum,operations.sum(num1,num2));
    }

    public static List<Arguments> provideParamsForSubtraction() {
        return List.of(
                Arguments.of(3, 1, 2),
                Arguments.of(3, -3, 6),
                Arguments.of(10, 5, 5)
        );
    }
    @ParameterizedTest
    @MethodSource ("provideParamsForSubtraction")
    public void methodCalculateCorrectSubtraction(Integer num1, Integer num2, Integer sub) {
        assertEquals(sub,operations.subtraction(num1,num2));
    }

    public static List<Arguments> provideParamsForMultiply() {
        return List.of(
                Arguments.of(3, 3, 9),
                Arguments.of(6, -5, -30),
                Arguments.of(7, 2, 14)
        );
    }
    @ParameterizedTest
    @MethodSource ("provideParamsForMultiply")
    public void methodCalculateCorrectMultiply(Integer num1, Integer num2, Integer multi) {
        assertEquals(multi,operations.multiply(num1,num2));
    }

    public static List<Arguments> provideParamsForDivide() {
        return List.of(
                Arguments.of(3, 3, 1),
                Arguments.of(6, -2, -3),
                Arguments.of(10, 2, 5)
        );
    }
    @ParameterizedTest
    @MethodSource ("provideParamsForDivide")
    public void methodCalculateCorrectDivide(Integer num1, Integer num2, Integer divide) {
        assertEquals(divide,operations.divide(num1,num2));
    }
}