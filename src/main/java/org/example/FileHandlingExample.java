package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandlingExample {
    public static void main(String[] args) {
        Path path = Paths.get("fileNotExists.txt");// returns the path of the file
        System.out.println("Absolute Path : " + path.toAbsolutePath());
        System.out.println("Path :" + path);
        System.out.println("File Name " + path.getFileName());
        System.out.println("Root :" + path.getRoot());


//        try(BufferedWriter writer=new BufferedWriter(new FileWriter("fileNotExists.txt"))) {
//             writer.write("Hello ");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            if (!Files.exists(path))
                Files.createFile(path);

            else
                System.out.println("File Already exits");
        } catch (IOException e) {
            System.out.println(""+e);
        }

    }
}
