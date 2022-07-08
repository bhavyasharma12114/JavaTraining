package Assignment4;
import java.util.stream.IntStream;

public class Q3ReduceInStream {
	public static void main(String[] args) {
		IntStream intStream = IntStream.of(11, 22, 33, 44, 55);

		int sum = intStream.reduce(0, (left, right) -> left + right);
		
		System.out.println(sum);
	}
}
