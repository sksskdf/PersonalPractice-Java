package timer;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerMain {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerCode();

        LocalDateTime ldt = LocalDateTime.now().plusSeconds(2);
        Date date = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
//
//        timer.schedule(timerTask, date);
        try {
            timer.schedule(timerTask, date, 100);
            Thread.sleep(2000);
            timerTask.cancel();
            timer.cancel();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
