package fun.Start;

import java.util.Scanner;

public class Start {
    public static void start() {
        final Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1, 2, 3, 4");
            switch (sc.nextInt()) {
                case 1 :
                    System.out.println("1");
                    break;
                case 2 :
                    System.out.println("2");
                    break;
                case 3 :
                    System.out.println("3");
                    break;
                case 4 :
                    System.out.println("4");
                    break;
                default :
                    System.out.println("Unknown Menu");
                    break;
            }
        }
    }
}
