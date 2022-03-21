package var;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class refswitch {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        var m = br.readLine().toUpperCase();

        switch (m){
            case "MON","TUE","WED" -> System.out.println("AA");
            case "THU","FRI","SAT","SUN" -> System.out.println("BB");
            default -> System.out.println("asd");
        }
    }
}
