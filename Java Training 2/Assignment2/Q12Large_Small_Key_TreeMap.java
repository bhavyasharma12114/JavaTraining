package Assignment2;

import java.util.*;

public class Q12Large_Small_Key_TreeMap {
  
    public static void main(String[] args)
    {
        TreeMap<Integer, String> tree= new TreeMap<Integer, String>();
  
        tree.put(100, " A");//in list and link list we use .add to add new  elements but in TreeMap we use .put to add elements in TreeMap.
        tree.put(120, " M");
        tree.put(140, " X");
        tree.put(200, " Z");
        tree.put(160, " Y" );
        
        System.out.println("Orginal TreeMap content: " + tree);
        System.out.println("Least key: " + tree.firstEntry());//always first entry is smallest because it is arrenging in sorted way.
        System.out.println("Greatest key: " + tree.lastEntry());//always last entry is grea.est
  
        
    }
}
