package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class lcdt {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String dt1 = date.atTime(time).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        System.out.println(dt1);
        LocalDateTime lcdt1 = LocalDateTime.now();
        LocalTime lt = lcdt1.toLocalTime().;
        System.out.println(lt);
    }
}
