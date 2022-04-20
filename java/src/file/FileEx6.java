package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileEx6 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\namhyunwoo\\Downloads\\dataset_91033.txt");

        try (Scanner sc = new Scanner(file)) {
            int sum = 0;
            while (sc.hasNext()) {
                int a = Integer.parseInt(sc.nextLine());
                sum += a;
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
