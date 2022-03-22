package ref;

import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.function.*;

public class refLambda {

    static List<String> retainStringsOfLength3(List<String> strings){
        Predicate<String> predicate = s -> s.length()==3;
        List<String> stringsOfLength3 = new ArrayList<>();
        for(String s:strings){
            if(predicate.test(s)){
                stringsOfLength3.add(s);
            }
        }
        return stringsOfLength3;
    }

    public static void main(String[] args) throws InterruptedException {

        Predicate<String> predicate = s -> s.length() == 3;
        Consumer<String> printer = s -> System.out.println(s);
        Runnable runnable = () -> System.out.println("i am running");

        String a = "asd";

        boolean isOfLength3 = predicate.test(a);
        System.out.println(isOfLength3);

        List<String> immutableStrings = List.of("one","two","three","four","five");
        List<String> strings2 = new ArrayList<>(immutableStrings);
        Predicate<String> isOddLength = s -> s.length()%2==0;
        strings2.removeIf(isOddLength);
        System.out.println("strings = " + strings2);

        runnable.run();

        /*Random random = new Random(314L);
        IntSupplier newRandom = () -> random.nextInt();

        for(int i=0; i<5; i++){
            int nextRandom = newRandom.getAsInt();
            printer.accept("next random = " + nextRandom);
        };*/

        BiConsumer<Random,Integer> randomNumberPrinter =
                (random,number)->{
                    for(int i=0; i<number; i++){
                        System.out.println("next random = "+random.nextInt());
                    }
                };
        randomNumberPrinter.accept(new Random(314L),5);

        List<String> strings = List.of("a","b","c","d");
        Consumer<String> printer2 = s -> System.out.println(s);
        strings.forEach(printer);
    }
}
