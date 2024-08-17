package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExisting {

    public boolean verify(String path){

        if(Files.exists(Path.of(path))){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) throws IOException {

        Path file= Paths.get("input.txt");
        FileExisting obj=new FileExisting();
        System.out.println(obj.verify(String.valueOf(file)));
    }
}
