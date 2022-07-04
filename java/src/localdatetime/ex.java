package localdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ex {
    public static void main(String[] args) {
        String initYearMonth = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMM"));
        System.out.println(initYearMonth.substring(0, 4));
        System.out.println(initYearMonth.substring(4, 6));
        System.out.println(initYearMonth);
    }
}
