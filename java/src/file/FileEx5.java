package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileEx5 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\namhyunwoo\\Downloads\\dataset_91007.txt");
        ArrayList<Integer> arr = new ArrayList<>();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                int n = sc.nextInt();
                arr.add(n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int compare = 0;
        for (int i = 0; i<arr.size(); i++) {
            if (arr.get(i) > compare) {
                compare = arr.get(i);
            }
        }

        System.out.println(compare);
    }
}
