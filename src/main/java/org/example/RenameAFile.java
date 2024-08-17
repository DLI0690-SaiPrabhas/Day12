package org.example;

import java.io.IOException;
import java.nio.file.*;

public class RenameAFile {
    public static void main(String[] args) {

        Path source= Paths.get("input.txt");
        Path target=Paths.get("fileNotExists.txt");

        try {
            Files.move(target,source, StandardCopyOption.REPLACE_EXISTING);

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
