package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDeleting {
    public static void main(String[] args) throws IOException {

        Path file= Paths.get("test.txt");

       if(file.toFile().exists()){
           Files.delete(file);
       }
       else
           System.out.println("There is no file to delete...");
    }
}
