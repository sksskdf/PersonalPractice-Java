package file;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("./a.txt");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getParent());
    }
}
