package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class bj10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        //arr[0]=20 , arr[1]=10
        sc.close();
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[a - 1]);
    }
}
