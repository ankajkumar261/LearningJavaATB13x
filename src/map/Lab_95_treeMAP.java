package map;

import java.util.Map;
import java.util.TreeMap;

public class Lab_95_treeMAP {
    public static void main(String[] args) {


        Map values = new TreeMap();

        values.put("Second", 2);
        values.put("First", 1);
        values.put("Third", 3);
        System.out.println("TreeMap (sorted by keys): " + values);


    }
}
