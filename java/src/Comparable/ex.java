package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex {
    public static void main(String[] args) {
        ExClass exClass1 = new ExClass();
        ExClass exClass2 = new ExClass();
        ExClass exClass3 = new ExClass();

        exClass1.setNumber(1);
        exClass1.setName("Leo");

        exClass2.setNumber(2);
        exClass2.setName("Brad");

        exClass3.setNumber(1);
        exClass3.setName("Abraham");

        List<ExClass> exClassList = new ArrayList<>();
        exClassList.add(exClass2);
        exClassList.add(exClass1);
        exClassList.add(exClass3);

        Collections.sort(exClassList);
        System.out.println(exClassList);
    }
}
