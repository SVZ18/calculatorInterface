package com.company;

import java.util.Scanner;

import com.company.operation.*;

public class Main {

    public static void main(String[] args) {
        // Assignment:
        // create an interface with just one method called 'operation'
        // This method has the following signature: operation(int firstNumber, int secondNumber);
        // Create classes to implement the following operations
        // using the interface above: Add, Subtract, Multiplication, Division, Square and SquaReroot.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        float firstNumber = sc.nextFloat();

        System.out.println("Enter the second value:");
        float secondNumber = sc.nextFloat();

        Operation add = new Add(firstNumber, secondNumber);
        System.out.println("Sum of the values: " + add.getResult());

        Operation subtract = new Subtract(firstNumber, secondNumber);
        System.out.println("Subtract first value from second value: " + subtract.getResult());

        Operation multiplication = new Multiplication(firstNumber, secondNumber);
        System.out.println("First value multiplied by second value: " + multiplication.getResult());

        Operation division = new Division(firstNumber, secondNumber);
        System.out.println(firstNumber + " divided by " + secondNumber + " equals " + division.getResult());
        System.out.println();

        System.out.println("Enter a number you want to square: ");
        float number = sc.nextFloat();
        Operation square = new Square(number);
        System.out.println("Your number squared: " + square.getResult());

        System.out.println("Enter a number you want to calculate a square root of: ");
        float value = sc.nextFloat();
        Operation squareRoot = new SquareRoot(value);
        System.out.println("Square root of your number: " + squareRoot.getResult());

    }
}
