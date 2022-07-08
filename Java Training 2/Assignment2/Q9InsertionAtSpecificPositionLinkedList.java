package Assignment2;

import java.util.LinkedList;
public class Q9InsertionAtSpecificPositionLinkedList {
 public static void main(String[] args) {
  
  LinkedList <String> l_list = new LinkedList <String> ();
  
  l_list.add("Red");
  l_list.add("Green");
  l_list.add("Black");

  System.out.println("Original linked list:" + l_list);


  LinkedList <String> new_l_list = new LinkedList <String> ();
  new_l_list.add("White");
  new_l_list.add("Pink");

  l_list.addAll(1, new_l_list);//this addAll function is use when we want to add a group of string at a specific position
                                //Otherwise we can use l_list.add(1,"new element");
  System.out.println("LinkedList:" + l_list);
 }
}
