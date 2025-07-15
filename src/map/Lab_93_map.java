package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab_93_map {
    public static void main(String[] args) {

        Map map = new LinkedHashMap();

        map.put("id",1);
        map.put("id1",2);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id6",34);
        map.put("id4",null);
        map.put("id5",null);

        System.out.println(map);
        System.out.println(map.containsValue(34));
        System.out.println(map.isEmpty());
        System.out.println();

    }
}
