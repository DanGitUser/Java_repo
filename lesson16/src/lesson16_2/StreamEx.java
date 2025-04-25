package lesson16_2;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		//1. Stream construction guide
		//of(), builder(), generate(), From array,from collection
		
		//2. Types of Stream
		//Stream<T>, IntStream, DoubleStream, LongStream
		
		//.Stream calculation
		//forEach()
		
		//filter(), distinct(), map(), flatMap(), boxed(), sorted(), peek()
		
//		List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		List<Integer> list = IntStream.rangeClosed(1, 10).boxed().sorted((o1, o2) -> o2 + o1).collect(Collectors.toList());
		List<Integer> list1 = IntStream.rangeClosed(1, 10).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(list1);
		
//		long count = new Random().ints(10, 0, 10).boxed().peek(System.out::println).count();
		List<Integer> count = new Random().ints(10, 0, 10).boxed().peek(System.out::println).collect(Collectors.toList());
		System.out.println(count);
		
		boolean result = Stream.of(1, 3, 5, 7).allMatch(i -> i%2 == i);
		System.out.println(result);
		result = Stream.of(1, 3, 5 ,8).anyMatch(i -> i%2 == 1);
	}
}
