package holiday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class convertHolidayFormat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            StringBuffer sb = new StringBuffer();
//            ArrayList<String> collect = Arrays.stream(sc.nextLine().split("\n")).collect(Collectors.toCollection(ArrayList::new));
//            collect.forEach(l -> {
//                sb.append(l);
//                sb.insert(6,"'");
//                sb.insert(7,",");
//                sb.insert(8,"'");
//                sb.insert(11,"'");
//                sb.insert(12,",");
//                sb.insert(13,"'");
//                System.out.println(sb.toString());
//            });
//        }
        String a = "202204";
        System.out.println(a.substring(0,4));
        System.out.println(a.substring(4,6));
        System.out.println(a.substring(5,6));
    }
}
