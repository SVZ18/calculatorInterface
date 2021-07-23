package com.company.operation;

import com.company.operation.Operation;

public class Square implements Operation {

    private float number;

    public Square(float number){
        this.number = number;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public float getResult() {
        return (float) (Math.pow(number, 2));
    }
}
