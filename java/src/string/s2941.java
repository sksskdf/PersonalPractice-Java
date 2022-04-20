package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class s2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cro = br.readLine();
        Pattern pattern = Pattern.compile("(c=|c\\W|dz=|d\\W|lj|nj|s=|z=]+)|[a-z]");
        Matcher matcher = pattern.matcher(cro);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);

    }
}
