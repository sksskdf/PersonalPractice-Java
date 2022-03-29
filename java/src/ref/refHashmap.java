package ref;

import java.util.HashMap;
import java.util.Map;

public class refHashmap {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("반",1);
        m.put("학년",1);
        for(String key:m.keySet()){
            System.out.println(String.format("키 :%s, 값: %s",key,m.get(key)));
        }
    }
}
