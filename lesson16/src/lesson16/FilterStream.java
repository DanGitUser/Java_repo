package lesson16;

import java.util.List;

public class FilterStream {
	public static void main(String[] args) {
		List<String> list = List.of("America", "Banana", "America", "Crazy", "America");
		System.out.println("distinct >");
		list.stream().distinct().forEach(System.out::println);
		
		System.out.println("Filter words starting with 'A'");
		list.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
		
		System.out.println("Filter words starting with 'A' + distinct");
		list.stream().distinct().filter(s->s.startsWith("A")).forEach(System.out::println);
	}
}
