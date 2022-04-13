package araay;

import java.util.ArrayList;
import java.util.List;

public class arr {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("A");
        arr.add("A");

        System.out.println(arr.stream().toList());
    }
}
