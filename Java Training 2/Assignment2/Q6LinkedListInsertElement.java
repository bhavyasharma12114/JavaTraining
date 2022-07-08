package Assignment2;

import java.util.LinkedList;
public class Q6LinkedListInsertElement {
	public static void main(String[] args) {
		
		LinkedList <String> l_list = new LinkedList <String> ();
		
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		System.out.println("Original linked list: ");
		System.out.println("Let add some another  Colors: " + l_list);
		l_list.add(1, "Yellow");
		l_list.add(2, "Grey");
		System.out.println("The linked list:" + l_list);
	}
}
