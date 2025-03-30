package com.bridgeLabz.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Performing division
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");

        } finally {
            scanner.close();
        }
    }
}
//Enter the numerator: 5
//Enter the denominator: a
//Error: Please enter valid numeric values.