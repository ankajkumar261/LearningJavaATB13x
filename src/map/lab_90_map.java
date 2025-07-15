package map;

import java.util.HashMap;
import java.util.Map;

public class lab_90_map {
    public static void main(String[] args) {


        Map<String, Integer> m1 = new HashMap();

        m1.put("Ankaj", 1);
        m1.put("Ankaj", 1);
        m1.put("sumit", 2);

        // duplicate are not allowed
        //- stores data in **key-value pairs.**


        System.out.println(m1);


        for(String key : m1.keySet()){
            System.out.println(key + "--> "+ m1.get(key));
        }

    }
}
