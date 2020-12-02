package com.javamentor.calculator;

import java.util.Arrays;

public class Action {
    private int a;
    private int b;
    private String operator;


    public Action(int a, int b, String operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    int result;

    public int solution() {

        switch (operator) {
            case "+":
                Summ summ = new Summ(a, b);
                result = summ.solution();
                return result;

            case "-":
                Subtraction subtraction = new Subtraction(a, b);
                result = subtraction.solution();
                return result;

            case "*":
                Multiply multiply = new Multiply(a, b);
                result = multiply.solution();
                return result;

            case "/":
                Divide divide = new Divide(a, b);
                result = divide.solution();
                return result;

            default:
                return 0;
        }
    }
}
