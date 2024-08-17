package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadLineByLine {

    public static void Read(String path){

        Path path1= Paths.get(path);

        try(Stream<String> lines= Files.lines(path1)) {

            lines.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
            Read("fileNotExists.txt");
    }
}
