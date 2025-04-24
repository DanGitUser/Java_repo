package lesson14;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Ex250423 {
	public static void main(String[] args) {
		// use Map to calculate the frequency of a char
		String str = "aaaaabbbbcccddddd";
		Map<String, Integer> map = new HashMap<>();
		String[] strs = str.split("");
		Stream.of(strs).forEach(s->{
			Integer i = map.get(s);
			map.put(s, i == null ? 1 : i + 1);
		});
		System.out.print(map);
	}
}
//			if (i == null) {
//				map.put(s, 1);
//			} else {
//				map.put(s, i + 1);
//			}
