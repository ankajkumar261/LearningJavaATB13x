package map;

import java.util.Hashtable;

public class Lab_94_hashtable {
    public static void main(String[] args) {

        Hashtable h1 = new Hashtable();

       // h1.put("Ankaj", 1);


        h1.put(1, "one");
        h1.put(1, "one");
        h1.put(2, "two");
        h1.put(3, "three");

//        ht1.put(4, null); // java.lang.NullPointerException
//        ht1.put(null, "three");  // java.lang.NullPointerException


        System.out.println(h1);



    }
}
