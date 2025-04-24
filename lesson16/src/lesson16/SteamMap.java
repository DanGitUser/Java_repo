package lesson16;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SteamMap {
	public static void main(String[] args) {
		
		
		List<Student> student = List.of(new Student("새똥이", 100),new Student("개똥이", 100), new Student("말똥이", 100));
		Stream<Student> stream = student.stream();
		IntStream stream2 = stream.mapToInt(s -> s.score);
//		stream2.forEach(System.out::println);
		int sum = stream2.sum();
		System.out.println(sum);
	}
}

class Student {
	String name;
	int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return String.format("Student [name=%s, score=%s]", name, score);
	}
}
