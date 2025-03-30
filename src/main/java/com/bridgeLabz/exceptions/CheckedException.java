package com.bridgeLabz.exceptions;

import java.io.*;
public class CheckedException{
    public static void main(String[] args) {
        {
            try{
                // Attempt to read the file

                BufferedReader reader= new BufferedReader(new FileReader("C:\\Users\\Harma\\bridgeLabz-workspace\\java-exceptions\\src\\main\\java\\data.txt"));
                String line;
                while((line=reader.readLine()) !=null){
                    System.out.println(line);

                }
            }catch(IOException e){  // Handles file not found or reading error
                System.out.println("File not Found");

            }
        }
    }
}
//File not Found