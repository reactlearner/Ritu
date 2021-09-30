package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionExample {

    // Collection - List, Set, Queue
    // List - Arraylist, Linkedlist, Stack, vector
    // Set - Hashset, linkedhashset
    // Queue - Dqueue,

    public static void main(String args[]) {
        List<String> li = new ArrayList<>();
        li.add("G1");
        li.add("G2");
        li.add("G3");
        li.add("G1");
        li.add(null);
        li.add(null);
        boolean val = li.contains("G3");

        Set<String> set = new HashSet<>();
        set.add("G1");
        set.add("G2");
        set.add("G1");
        set.add(null);
        set.add(null);

      for(String s : li) {
          System.out.println(s);
      }
    }
}
