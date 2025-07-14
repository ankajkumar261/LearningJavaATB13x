package Ex_031_Collection_framework;

import java.util.Iterator;
import java.util.LinkedList;


public class Linkedlist {
    public static void main(String[] args) {

       LinkedList linkedList = new LinkedList();

       linkedList.add(3);
       linkedList.add(2);
       linkedList.add(1);

        System.out.println(linkedList);

        Iterator iterator = linkedList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
