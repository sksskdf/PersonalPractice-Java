package ref;

public class refStringBuffer {
    public static void main(String[] args) {
        String a = "asd";
        a = "abc";
        System.out.println(a);

        String b = new String("asd");
        b = "abc";
        System.out.println(b);
    }
}
