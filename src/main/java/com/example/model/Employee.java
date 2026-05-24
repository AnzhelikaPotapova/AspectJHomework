package com.example.model;

public class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
        System.out.println("Выполняется конструктор Employee");
    }

    public String getName() {
        System.out.println("Выполняется метод getName");
        return name;
    }
}