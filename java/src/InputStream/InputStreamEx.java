package InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("./src/InputStream/ex.txt");
        byte[] bytes = new byte[5];
        int numberOfBytes = inputStream.read(bytes);
        System.out.println(numberOfBytes);
        inputStream.close();
    }
}
