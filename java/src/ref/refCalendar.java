package ref;


import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class refCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        c.roll(Calendar.YEAR,-4);
        System.out.println(c.getTime());

        c.set(Calendar.YEAR,4000);
        System.out.println(c.getTime());
    }
}
