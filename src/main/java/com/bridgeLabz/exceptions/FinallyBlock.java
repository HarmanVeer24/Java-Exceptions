package com.bridgeLabz.exceptions;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int num2 = scanner.nextInt();
            System.out.println("Result: " + (num1 / num2));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("Operation completed"); // Always executes
            scanner.close();
        }
    }

}
//Enter numerator: 5
//Enter denominator: 0
//Cannot divide by zero!