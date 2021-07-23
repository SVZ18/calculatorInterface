package com.company.operation;

import com.company.operation.Operation;

public class SquareRoot implements Operation{

    private float value;

    public SquareRoot(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getResult() {
        return(float) (Math.sqrt(value));
    }
}
