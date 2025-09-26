package MapDemo.HashMapDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternal {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("four",40);
        map.put(null,77);

        System.out.println(map.get("two"));
    }
}
