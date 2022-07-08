package Assignment4;

import java.util.stream.LongStream;

public class Q6countAndfilterInStream {
	public static void main(String[] args) {
		long count = LongStream.of(1,2,3,4,5,6,7,8,9)
				.filter(i -> i%2 == 0)
	            .count();
		System.out.println(count);
	}
}
