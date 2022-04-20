package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileEx2 {
    public static void main(String[] args) {
        String path = "./src/file/a.txt";
        File file = new File(path);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No File : " + path);
        }
    }
}
