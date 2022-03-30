package ref;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class refMethodRef {
    public static void main(String[] args) {
        DoubleUnaryOperator oper;
        oper = Math::abs;
        System.out.println(oper.applyAsDouble(-5));

        Function<Integer,double[]> func1 = a -> new double[a];
        Function<Integer,double[]> func2 = double[]::new;
    }
}
