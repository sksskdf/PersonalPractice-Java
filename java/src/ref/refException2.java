package ref;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

public class refException2 {
    public static void main(String[] args) {
        byte[] list = {'a','b','c'};
        try {
            System.out.write(list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //try-with-resources

    }
}
