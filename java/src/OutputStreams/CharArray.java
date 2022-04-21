package OutputStreams;

import java.io.IOException;
import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) throws IOException {
        String[] strings = new String[]{"This"," ","is"," ","a"," ","test"};
        char[] chars = String.join("",strings).toCharArray();
        Arrays.asList(chars).forEach(System.out::println);
    }
}
