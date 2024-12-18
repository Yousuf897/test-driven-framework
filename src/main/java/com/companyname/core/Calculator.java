package com.companyname.core;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return sum(a, b) + c;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return multiply(a, b) * c;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int subtract(int a, int b , int c) {
        return subtract(a, b) - c;
    }

}
