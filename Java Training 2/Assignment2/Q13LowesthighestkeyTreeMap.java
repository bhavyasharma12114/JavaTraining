package Assignment2;
import java.util.*;
public class Q13LowesthighestkeyTreeMap {  
     public static void main(String args[]) {

  TreeMap <String,String> tree = new TreeMap <String,String> ();//we can also use TreeMap <Integer, Integer> , TreeMap <String,Integer>

  tree.put("C2", "Red");
  tree.put("C1", "Green");
  tree.put("C4", "Black");
  tree.put("C3", "White");

  System.out.println("Orginal TreeMap content: " + tree);
  System.out.println("Greatest key: " + tree.firstKey());//when we want to print values then we use tree.firstentry(),
  System.out.println("Least key: " + tree.lastKey());//and if we want to print key values then we use tree.lastKey()
 }
}
