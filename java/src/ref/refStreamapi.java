package ref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class refStreamapi {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        Stream<Integer> stream1 = list.stream();
        stream1.forEach(System.out::println);

        /******************************************************************/


        String[] arr = new String[]{"일","이","삼","사"};

        Stream<String> stream2 = Arrays.stream(arr);
        stream2.forEach(e->System.out.println(e + " "));
        System.out.println();

        Stream<String> stream3 = Arrays.stream(arr,1,3);
        stream3.forEach(e-> System.out.println(e + " "));

        Stream<Double> stream4 = Stream.of(4.2,2.5,3.1,1.9);
        stream4.forEach(System.out::println);

        IntStream stream5 = IntStream.range(1,4);
        stream5.forEach(System.out::println);

        IntStream stream6 = IntStream.rangeClosed(1,4);
        stream6.forEach(System.out::println);

        System.out.println("<--------------------------------------------------->");

        /**********************************************************************/

        IntStream str = IntStream.range(1,100);
        str.forEach(System.out::println);

        IntStream stream7 = new Random().ints(4);
        stream7.forEach(System.out::println);

    }
}
