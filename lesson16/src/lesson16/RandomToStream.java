package lesson16;

import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.stream.IntStream;

public class RandomToStream {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("int random num");
		IntStream is = random.ints(3);
		
		System.out.println("=================");
		is = random.ints(10, 0, 3);
		is.forEach(System.out::print);
		
		System.out.println("\nlong type random");
		random.longs(3, 0, 10).forEach(System.out::print);
		
		System.out.println("\ndouble type random");
		random.doubles(3, 0, 10).forEach(System.out::println);
		
		"ABCD".chars().forEach(i -> System.out.print((char)i));
		
		
//		is.forEach(System.out::println);
////		DoubleBinaryOperator dbo = (x, y) -> Math.max(x, y);
//		DoubleBinaryOperator dbo = Math::max;
//		dbo.applyAsDouble(10, 20);
////		BiPredicate<String, String> pre = (s1, s2) -> s1.equals(s2);
//		BiPredicate<String, String> pre = String::equals;
//		
//		Function<String, Integer> fn = Integer::parseInt;
//		Function<String, Data2> fn2 = Data2::new;
//		
//		
//	}
//}
//
//class Data2 {
//	String name;
//	public Data2(String name) {
//		this.name = name;
//	}
	}
}
