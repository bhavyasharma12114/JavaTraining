package Assignment4;


import java.util.*;
	  
public class Q1forEach {
	  public static void main(String[] args)
	  {
		  List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
	      list.stream().forEach(System.out::println);
	    }
}
