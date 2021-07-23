package com.company;

import com.company.operation.Operation;

public class Add implements Operation {

    private float firstNumber;
    private float secondNumber;

    public Add(float firstNumber, float secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public float getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(float firstNumber) {
        this.firstNumber = firstNumber;
    }

    public float getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(float secondNumber) {
        this.secondNumber = secondNumber;
    }
    public float getResult() {
        return (float) (firstNumber + secondNumber);
    }
}
