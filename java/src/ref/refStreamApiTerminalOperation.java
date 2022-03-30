package ref;

import java.util.Optional;
import java.util.stream.Stream;

public class refStreamApiTerminalOperation {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("넷","셋","둘","하나","일");

        Optional<String> result1 = stream1.reduce((x, y)->x + "++" + y);
        result1.ifPresent(System.out::println);
    }
}
