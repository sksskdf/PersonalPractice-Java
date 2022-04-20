package FileWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterEx {
    public static void main(String[] args) {
        File file = new File("./src/FileWriter/ex.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Hello");
            writer.write("Java");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.print("Hello");
            printWriter.println("Java");
            printWriter.println("123");
            printWriter.printf("Hello %d",123);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
