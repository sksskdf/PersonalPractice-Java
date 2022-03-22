package ref;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class refSwitchEx {

    public static void main(String[] args) throws IOException {
        boolean se = true;
        boolean start = true;
        while (se) {
            System.out.println("===========================");
            System.out.println("main");
            System.out.println("1. start");
            System.out.println("2. settings");
            System.out.println("3. quit");
            System.out.println("===========================");
            System.out.print("select : ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int menu = Integer.parseInt(br.readLine());

            switch (menu) {
                case 1 -> {
                    System.out.println("start");
                    while(start){

                    }
                }
                case 2 -> {
                    System.out.println("settings");
                }
                case 3 -> {
                    se = false;
                    System.out.println("exit");
                }
            }
        }
    }
}
