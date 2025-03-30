package com.bridgeLabz.exceptions;

import java.util.*;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        Integer[] arr = { 4, 4, 7, 1, 9, 4 };
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } finally {
            sc.close();
            {

            }

        }

    }
}
//Enter index to access: 7
//Invalid index!
