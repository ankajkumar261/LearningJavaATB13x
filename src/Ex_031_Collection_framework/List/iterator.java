package Ex_031_Collection_framework.List;

import java.util.ArrayList;
import java.util.Iterator;


public class iterator {
    public static void main(String[] args) {


        ArrayList arrayList= new ArrayList();

        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
