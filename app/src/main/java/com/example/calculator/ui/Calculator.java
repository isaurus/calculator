package com.example.calculator.ui;

public class Calculator {

    private float oper1;
    private float oper2;
    private float result;

    public float add(float oper1, float oper2){

       this.result = oper1 + oper1;

        return result;
    }

    public float substract(float oper1, float oper2){

        this.result = oper1 - oper2;

        return result;
    }

    public float divide(float oper1, float oper2){

        this.result = oper1 / oper2;

        return result;
    }

    public float multiply(float oper1, float oper2){

        this.result = oper1 * oper2;

        return result;
    }

    public String parseResult(float result){
        return String.valueOf(result);
    }
}
