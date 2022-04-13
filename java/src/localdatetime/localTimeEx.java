package localdatetime;

public class localTimeEx {
    public static void main(String[] args) {
        int time = 500000;
        int hour = (time/(60*60))%24;
        int minuite = (time/60)%60;
        int second = time%60;
        System.out.printf("%s %s %s",hour,minuite,second);
    }
}
