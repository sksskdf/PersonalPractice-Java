package ref;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class refswitch {
    public static String method(int n){
        String s =
                switch (n){
                    case 1,2,3 -> {
                        System.out.println("123");
                        yield "123";
                    }
                    default -> {
                        System.out.println("none");
                        yield "none";
                    }
                };
        return s;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        method(Integer.parseInt(br.readLine()));


        /*var m = br.readLine().toUpperCase();


        var n =
            switch(m){
                case "A","B","C" -> "ABC";
                case "D","E","F" -> "DEF";
                default -> "NONE";
            };

        System.out.println(n);*/


        /*switch (m){
            case "MON","TUE","WED" -> System.out.println("AA");
            case "THU","FRI","SAT","SUN" -> System.out.println("BB");
            default -> System.out.println("asd");
        }*/
    }
}
