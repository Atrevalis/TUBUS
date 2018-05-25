package com.example.ilya.tubus;

/**
 * Created by ilya on 13.03.2018.
 */

public class Expression {
    Expression[] directions;
    String example;
    int RightNumber;

    public Expression(String example, int RN) {
        this.example = example;
        this.RightNumber = RN;
        directions = new Expression[20];
    }

}
