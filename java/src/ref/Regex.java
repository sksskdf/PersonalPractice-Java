package contacts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String a = "Hello, World\\.";
        String set = "[abc]bc";
        String range = "[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]";
        String email = "[a-zA-z][a-zA-z][a-zA-z][a-zA-z]@[a-zA-z][a-zA-z][a-zA-z][a-zA-z][a-zA-z]\\.com";
        String b = "yes|no|maybe";
        System.out.println("Hello, World.".matches(a));
        System.out.println("bbc".matches(set));
        System.out.println("010-1234-1234".matches(range));
        System.out.println("aaaa@naver.com".matches(email));
        System.out.println("aaaa@naver.com".matches(email));
        System.out.println("yes".matches(b));

        String regex = "[Java][7-9]";
        System.out.println("a8".matches(regex));

        String regex2 = "ca+b";
        System.out.println("caaaaaaaaaaaaaaaaaaaaab".matches(regex2));

        String regex3 = "A[0-3]*";
        System.out.println("A00000000011100123012301230123012301203".matches(regex3));

        String regex4 = "[0-9]{4}-[0-9]{3,4}";
        System.out.println("0000-000".matches(regex4));

        String regex5 = "0\\.[0-9]{2}9{0,2}5*";
        System.out.println("0.1295".matches(regex5));

        String regex6 = "\\s*[az]";
        System.out.println("a".matches(regex6));

        String text = "We use Java to write modern applications";
        Pattern pattern = Pattern.compile(".*[Jj]ava.*");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());

        System.out.println(Pattern.matches("(?is).*java.*","a a JAVA a  a"));

        String text2 = "asdasdasdsds java asdasdasdasd";
        Pattern pattern1 = Pattern.compile("java");
        Matcher matcher1 = pattern1.matcher(text2);
        System.out.println(matcher1.matches());
        System.out.println(matcher1.find());
        System.out.println(matcher1.start());
        System.out.println(matcher1.end());
        System.out.println(matcher1.group());

        Pattern pattern2 = Pattern.compile("^tool$");
        Matcher matcher2 = pattern.matcher("abc tool");

        //System.out.println(matcher2.matches());
        //System.out.println(matcher2.find());

        String number = "+0 (123) 123 123-1234";
        Pattern pattern5 = Pattern.compile("\\S*\\S*\\S\\d{3}\\S\\s\\d{3}\\D*\\d{3}\\D\\w{4}");
        Matcher matcher5 = pattern5.matcher(number);
        System.out.println(matcher5.find());
    }
}
