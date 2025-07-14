package Ex_031_Collection_framework.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linked_hash_list {
    public static void main(String[] args) {

        HashSet hashSet = new LinkedHashSet();

        hashSet.add(2);
        hashSet.add("Ankaj");

        System.out.println(hashSet);

        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
