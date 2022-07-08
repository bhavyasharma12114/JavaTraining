package Assignment4;
import java.util.List;
import java.util.stream.Collectors;

//Java Stream collect() performs a mutable reduction operation on the elements of the stream. This is a terminal operation.

import java.util.Arrays;

public class Q4CollectInStream {

	public static void main(String[] args) {

		List<String> items = Arrays.asList("hello", "how", "are", "you", "doing", "brother");
			
		List<String> list = items.stream()
				.map(word -> word.toUpperCase())  //using lambda in map operator
				.collect(Collectors.toList()); 	  //here we are using collect opertor 
			
		System.out.println(list);
		}

	}
