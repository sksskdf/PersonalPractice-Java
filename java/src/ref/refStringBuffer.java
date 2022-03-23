package ref;

public class refStringBuffer {
    public static void main(String[] args) {
        //String is immutable but StringBuffer is mutable
        String a = "asd";
        a = "abc";
        System.out.println(a);

        String b = new String("asd");
        b = "abc";
        System.out.println(b);

        StringBuffer sb = new StringBuffer("java");
        System.out.println(sb);

        sb.append("class");
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append("harryaaaaaaa");
        System.out.println(sb.capacity());

        sb.delete(14,21);
        System.out.println(sb);

        sb.append("a");
        System.out.println(sb);

        sb.deleteCharAt(14);
        System.out.println(sb);

        sb.insert(4,"insert");
        System.out.println(sb);
    }
}
