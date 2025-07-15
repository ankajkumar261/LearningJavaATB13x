package map;

import java.util.HashMap;
import java.util.Map;

public class Lab_91_contains {

    public static void main(String[] args) {


        Map<String, Integer> m1 = new HashMap();

        m1.put("Ankaj", 1);
        m1.put("Ankaj", 1);
        m1.put("sumit", 2);
        m1.put("nischal", 3);


        if(m1.containsValue(3)){
            System.out.println("yes");
        }
        else
        {
            System.out.println("NO");
        }



    }


}
