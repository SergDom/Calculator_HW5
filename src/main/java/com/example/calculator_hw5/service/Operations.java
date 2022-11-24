package com.example.calculator_hw5.service;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service

public class Operations {

    public Integer sum(Integer x, Integer y) {
        if (x == null || y == null) {
            throw new IllegalArgumentException("Переменные не заданы");
        }

        return x + y;
    }

    public Integer subtraction(Integer x, Integer y) {
        if (x == null || y == null) {
            throw new IllegalArgumentException("Переменные не заданы");

        }
        return x - y;
    }

    public Integer multiply(Integer x, Integer y) {
        if (x == null || y == null) {
            throw new IllegalArgumentException("Переменные не заданы");
        }
        return x * y;
    }

    public Integer divide(Integer x, Integer y) {
        if (x == null || y == null) {
            throw new IllegalArgumentException("Переменные не заданы");

        }
        if (y == 0) {
            throw new IllegalArgumentException("Делить на 0 нельзя!");
        }
        return x / y;
    }
}
