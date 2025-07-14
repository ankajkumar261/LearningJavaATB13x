package Ex_031_Collection_framework;

import java.util.*;


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

    public static class Lab_88_sorting {
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
}
