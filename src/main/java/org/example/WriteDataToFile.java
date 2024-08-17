package org.example;


import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class WriteDataToFile {
    public static void main(String[] args) throws IOException {

        Path filePath= Paths.get("test1.txt");
        String str="Hello,How are you";
        try {
            Files.write(filePath,str.getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("" + e);
        }
        System.out.println("Successfully added");

    }
}
