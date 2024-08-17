package org.example;


import java.io.IOException;
import java.nio.file.*;

public class CopyFile {
    public static void main(String[] args) {

        Path sourcepath= Paths.get("input.txt");
        Path destinationpath=Paths.get("fileNotExists.txt");
        try{

            Files.copy(sourcepath,destinationpath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copying completed");
        }

        catch (IOException e){
            System.out.println(e.getMessage());

        }

    }
}
