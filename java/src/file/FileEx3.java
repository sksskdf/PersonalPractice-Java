package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileEx3 {
    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args) {
        String path = "./src/file/FileEx2.java";
        try {
            System.out.println(readFileAsString(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
