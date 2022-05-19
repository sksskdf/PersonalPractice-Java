package SerailizeDeserialize;

import java.io.IOException;
import java.io.Serializable;

public class SomeClass implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String a = "abc";
        SerializationUtils.serialize(a,"ser.txt");
        Object obj = SerializationUtils.deserialize("ser.txt");
        System.out.println(obj.toString());
    }
}
