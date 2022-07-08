package Assignment2;

import java.util.LinkedList;
//import java.util.Iterator;
	  
public class Q11ElementAndPositionLinkedList {
	 public static void main(String[] args) {
	     LinkedList<String> l_list = new LinkedList<String>();
	          l_list.add("Red");
	          l_list.add("Green");
	          l_list.add("Black");
	          l_list.add("Pink");
	          l_list.add("orange");
	      
	   System.out.println("Original linked list:" + l_list);  
	  for(int p=0; p <l_list.size(); p++)//it will give error when we execute it in reverse order.
	   {
	      System.out.println("Element at index "+p+": "+l_list.get(p));
	    } 
	 }
	}
