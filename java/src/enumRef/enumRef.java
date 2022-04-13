package enumRef;

import java.util.Arrays;

public class enumRef {
    public enum A {
        A(1),
        B(2),
        C(3);

        A(int number) {
            this.number = number;
        }

        private final int number;

        public int getNumber() {
            return number;
        }
    }

    public static void main(String[] args) {
        A a = A.A;
        A b = A.B;
        A c = A.valueOf("A");
        A d = A.A;
        System.out.println(c);
        A[] arr = A.values();

        System.out.println(A.A.ordinal());
        System.out.println();
        System.out.println(a == d);
        System.out.println();
        System.out.println(A.valueOf("A"));
        System.out.println();
        System.out.println(Arrays.stream(arr).toList());
    }
}
