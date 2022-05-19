package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class exStream {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        
        list.stream().forEach(System.out::println);
    }
}
