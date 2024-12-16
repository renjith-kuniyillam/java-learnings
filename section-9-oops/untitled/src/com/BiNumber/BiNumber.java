package com.BiNumber;

public class BiNumber {
    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    int number1;
    int number2;

    public BiNumber(int num1, int num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    public int add() {
        return this.number1 + this.number2;
    }

    public int multiply() {
        return this.number1 * this.number2;
    }

    public void doubleNumber() {
        this.number1 *= 2;
        this.number2 *= 2;
    }
}
