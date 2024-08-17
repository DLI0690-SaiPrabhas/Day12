package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ByteBufferWrite {
    public static void main(String[] args) {

        Path source= Paths.get("input.txt");
        Path target=Paths.get("target.txt");

        try(FileInputStream inputStream=new FileInputStream(source.toFile());
            FileOutputStream outputStream=new FileOutputStream(target.toFile())){

            FileChannel channel=inputStream.getChannel();
            ByteBuffer buffer=ByteBuffer.allocate(100);
            channel.read(buffer);

            String str=new String(buffer.array());
            System.out.println(str);
            channel=outputStream.getChannel();
            int a= channel.write(ByteBuffer.wrap(str.getBytes()));
            System.out.println(a);

        }

        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


}
