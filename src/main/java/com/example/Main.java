package com.example;

import com.example.model.Employee;
import com.example.service.CalculatorService;

public class Main {

    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();

        System.out.println("=== Проверка метода calculate ===");
        int calculateResult = calculatorService.calculate(10, 5);
        System.out.println("Результат calculate: " + calculateResult);

        System.out.println();

        System.out.println("=== Проверка конструктора Employee и метода getName ===");
        Employee employee = new Employee("Anzhelika");
        String employeeName = employee.getName();
        System.out.println("Имя сотрудника: " + employeeName);

        System.out.println();

        System.out.println("=== Проверка метода divide без ошибки ===");
        int divideResult = calculatorService.divide(10, 2);
        System.out.println("Результат divide: " + divideResult);

        System.out.println();

        System.out.println("=== Проверка метода divide с ошибкой ===");
        try {
            calculatorService.divide(10, 0);
        } catch (ArithmeticException exception) {
            System.out.println("Исключение обработано в main: " + exception.getMessage());
        }
    }
}