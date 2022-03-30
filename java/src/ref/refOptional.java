package ref;

import java.util.Optional;

public class refOptional {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable("asd");
        System.out.println(opt.get());
    }
}
