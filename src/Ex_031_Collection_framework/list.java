package Ex_031_Collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(1);
        //list.add("Ankaj");
        Collections.sort(list);
       // list.remove(0);
        System.out.println(list);



    }
}
