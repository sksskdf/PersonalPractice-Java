package stream;

import java.util.stream.Stream;

public class exStream2 {
    public static void main(String[] args) {
        Stream.iterate(1, x -> ++x).limit(10).forEach(System.out::println);

        //same as above code
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
