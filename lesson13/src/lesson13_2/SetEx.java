package lesson13_2;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Melon");
		set.add("Mango");
		
		Set<String> set2 = new HashSet<>();
		set2.add("Apple");
		set2.add("Grape");
		set2.add("Mango");
		
		System.out.println(set);
		System.out.println(set2);
		
		System.out.println(set.contains("Grape"));
		System.out.println(set2.contains("Apple"));
		
		Set<String> result = new HashSet<>(set);
		result.retainAll(set2);
		System.out.println("Intersecting Group");
		System.out.println(result);
		
		Set<String> result2 = new HashSet<>(set);
		result.addAll(set2);
		System.out.println("Union Group");
		System.out.println(result2);
	}
}
