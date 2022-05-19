package holiday;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class convertHolidayFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StringBuffer> holidayList = new ArrayList<>();
        int year = Integer.parseInt(sc.nextLine());
        while(sc.hasNext()) {
            ArrayList list = Arrays
                    .stream(sc.nextLine().split("\\s+"))
                    .map(l -> l.replaceAll("(¿¬ÈÞ)",""))
                    .map(l -> l.replaceAll("\\(\\D\\)",""))
                    .map(l -> l.replaceAll("[¿ù,ÀÏ]",""))
                    .collect(Collectors.toCollection(ArrayList::new));

            if (list.size() == 5) {
                list.remove(list.size()-1);
            }
            list.remove(0);
            int month = Integer.parseInt((String)list.get(0));
            int day = Integer.parseInt((String)list.get(1));

            LocalDate ld = LocalDate.of(year, month, day);
            String parsedDate = ld.format(DateTimeFormatter.ofPattern("yyyyMMdd")).toString();
            String holidayName = list.get(2).toString();
            String holidayFormat = "(" + "\'" + parsedDate + "\'" + "," + "\'" + holidayName + "\'" + ")" + ",";
            System.out.println(holidayFormat);
        }
    }
}
