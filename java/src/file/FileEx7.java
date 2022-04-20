package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileEx7 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\namhyunwoo\\Downloads\\dataset_91022.txt");
        final int compareBy = 9999;
        int count = 0;
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                if (sc.nextInt() > compareBy) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
