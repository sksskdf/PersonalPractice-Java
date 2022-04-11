package contacts;

import java.util.ArrayList;

public class GenericType<T> {
    private T t;

    GenericType(T t) {
        this.t = t;
    }

    T getT() {
        return this.t;
    }

    void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        var number = new GenericType<>('A').getT();

        System.out.println(number);

    }
}
