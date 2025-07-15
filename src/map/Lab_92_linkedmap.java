package map;

import java.util.*;

public class Lab_92_linkedmap {
    public static void main(String[] args) {


        Map m1 = new LinkedHashMap();
        m1.put("Ankaj", 1);
        m1.put("kumar", 2);
        m1.put("Avneet", 1);

        System.out.println(m1);

        Map m3 = new TreeMap();
        m3.put("firstname","pramod");
        m3.put("lastname","dutta");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);



    }
}
