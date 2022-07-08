package Assignment2;
import java.util.*;

public class Q14_Reverse_Keys_TreeMap {
   public static void main(String[] args)
   {

       TreeMap<Integer, String> treeMap = new TreeMap<>();

       treeMap.put(1, "Hello");
       treeMap.put(3, "geeks");
       treeMap.put(2, "on");
       treeMap.put(4, "geeksforgeeks");
      
       System.out.println("TreeMap in original order: " + treeMap);
       
     /*  TreeMap<Integer, String> treeMapRev= new TreeMap<>(Collections.reverseOrder());
       treeMapRev.put(1, "Hello");
       treeMapRev.put(2, "geeks");
       treeMapRev.put(3, "on");
       treeMapRev.put(4, "geeksforgeeks");
      
       System.out.println("TreeMap in reverse order: "+ treeMapRev);*/
       System.out.println("descendingMap: "+treeMap.descendingMap()); 
   }
}
