package algorithm;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class i2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int plusMinute = sc.nextInt();
        LocalTime lt = LocalTime.of(hour, minute).plusMinutes(plusMinute);
        if (lt.getMinute() == 0 && lt.getHour() == 0) {
            System.out.print(lt.format(DateTimeFormatter.ofPattern("H m")));
        } else if (lt.getMinute() == 0) {
            System.out.print(lt.format(DateTimeFormatter.ofPattern("HH m")));
        } else if (lt.getHour() == 0) {
            System.out.print(lt.format(DateTimeFormatter.ofPattern("H mm")));
        } else {
            System.out.print(lt.format(DateTimeFormatter.ofPattern("HH mm")));
        }
    }
}
