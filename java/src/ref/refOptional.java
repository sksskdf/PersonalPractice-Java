package ref;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class refOptional {
    public static void main(String[] args) throws ParseException {
        Optional<String> opt = Optional.ofNullable("asd");
        System.out.println(opt.get());

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        String a = timeFormat.format(new Date());
        Date date = timeFormat.parse(a);
        System.out.println(a);

    }
}
