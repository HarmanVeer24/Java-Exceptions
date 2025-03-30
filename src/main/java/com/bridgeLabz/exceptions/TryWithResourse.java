package com.bridgeLabz.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourse {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {
            System.out.println(reader.readLine()); // Reading the first line
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
//Error reading file