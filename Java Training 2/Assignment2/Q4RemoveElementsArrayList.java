package Assignment2;
import java.util.*;
public class Q4RemoveElementsArrayList {
	
	  public static void main(String[] args) {
	  
	  List<String> list_Strings = new ArrayList<String>();
	  list_Strings.add("Red");
	  list_Strings.add("Green");
	  list_Strings.add("Orange");
	  list_Strings.add("White");
	  list_Strings.add("Black");
	  
	  System.out.println(list_Strings);
	  
	  list_Strings.remove(2);
	  list_Strings.remove(3);
	  System.out.println("After removing third and fourth elements from the list:\n"+list_Strings);
	 }
	}
