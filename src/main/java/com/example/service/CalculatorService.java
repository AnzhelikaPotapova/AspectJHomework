package com.example.service;

public class CalculatorService {

    public int calculate(int firstNumber, int secondNumber) {
        System.out.println("Выполняется метод calculate");
        return firstNumber + secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        System.out.println("Выполняется метод divide");
        return firstNumber / secondNumber;
    }
}