package EXAMPLE;

import SerailizeDeserialize.SerializationUtils;

import java.io.IOException;
import java.util.Arrays;

public class ExampleDemo {
    public static void main(String[] args) {
        Citizen[] citizens = Init.initCitizens();
        final String filename = "citizens.data";
        try {
            SerializationUtils.serialize(citizens,filename);
            citizens = (Citizen[]) SerializationUtils.deserialize(filename);
            System.out.println(Arrays.toString(citizens));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
