package com.example.calculator_hw5.controller;

import com.example.calculator_hw5.service.Operations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class OperationController {
    private final Operations operations;

    public OperationController(Operations operations) {
        this.operations = operations;
    }

    @GetMapping
    public String welcome (){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String sum(@RequestParam("num1") Integer x, @RequestParam("num2") Integer y) {
        return String.format("%d + %d = %d", x, y, this.operations.sum(x, y));

    }

    @GetMapping("/minus")
    public String subtraction(@RequestParam("num1") Integer x, @RequestParam("num2") Integer y) {
        return String.format("%d - %d = %d", x, y, this.operations.subtraction(x, y));

    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") Integer x, @RequestParam("num2") Integer y) {
        return String.format("%d * %d = %d", x, y, this.operations.multiply(x, y));

    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") Integer x, @RequestParam("num2") Integer y) {
        return String.format("%d / %d = %d", x, y, this.operations.divide(x, y));

    }

}
