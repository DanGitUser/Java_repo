package lesson16_2;

import java.util.Optional;

public class OptionalEx {
	public static void main(String[] args) {
		Optional<Integer> optional = Optional.ofNullable(null);//When it's set to Null
		//if there is a non null, output that number

		System.out.println(optional.orElse(20));//output 20
		System.out.println(optional.isPresent());
		System.out.println(optional.orElseGet(()->30));
		
		optional.ifPresent(System.out::println);
		optional.ifPresentOrElse(System.out::println, System.out::println);
		
//		optional.orElseThrow(()->new RuntimeException("Im cooked"));
		
		
	}
}
