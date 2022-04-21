package OutputStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytes {
    public static void main(String[] args) throws IOException {
        String str = "stream";
        byte[] strAsBytes = str.getBytes();

        FileInputStream fileInputStream = new FileInputStream("data.jpg");
        byte[] jpgBytes = fileInputStream.readAllBytes();

        FileOutputStream fileOutputStream = new FileOutputStream("output.jpg");
        fileOutputStream.write(jpgBytes);
    }
}
