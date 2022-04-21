package OutputStreams;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ex1 {
    public static void main(String[] args) throws IOException {
        CharArrayWriter contactWriter = new CharArrayWriter();
        FileWriter bc1 = new FileWriter("business_card_1.txt",true);
        FileWriter bc2 = new FileWriter("business_card_2.txt",true);

        contactWriter.write("Phone: 111-222-333; Address: Java Avenue, 7");
        contactWriter.writeTo(bc1);
        contactWriter.writeTo(bc2);

        char[] array = contactWriter.toCharArray();
        System.out.println(array.toString());

        bc1.close();
        bc2.close();
        contactWriter.close();
    }
}
