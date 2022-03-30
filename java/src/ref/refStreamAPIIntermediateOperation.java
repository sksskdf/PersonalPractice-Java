package ref;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class refStreamAPIIntermediateOperation {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7,5,5,2,1,2,3,5,4,6);
        IntStream stream2 = IntStream.of(7,5,5,2,1,2,3,5,4,6);

        //distinct 중복요소제거
        stream1.distinct().forEach(System.out::print);
        System.out.println();
        System.out.println("<--------------------------------------->");
        //filter 조건에맞는 요소로 새로 구성한 스트림 반환
        stream2.filter(n->n%2!=0).forEach(System.out::print);
        System.out.println();
        Stream<String> stream3 = Stream.of("HTML","CSS","JAVA","JAVASCRIPT");
        stream3.map(s->s.length()).forEach(System.out::println);

        String[] arr = {"I study hard","You study JAVA","I am hungry"};
        Stream<String> stream = Arrays.stream(arr);
        stream.flatMap(s->Stream.of(s.split(" +"))).forEach(System.out::println);
    }
}
