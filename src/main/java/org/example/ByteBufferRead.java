package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ByteBufferRead {
    public static void main(String[] args) {

        Path filepath= Paths.get("input.txt");

        try{
            FileInputStream inputStream=new FileInputStream(filepath.toFile());
            FileChannel channel=inputStream.getChannel();
            ByteBuffer buffer=ByteBuffer.allocate(100);
            channel.read(buffer);

            String str=new String(buffer.array());
            System.out.println(str);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
