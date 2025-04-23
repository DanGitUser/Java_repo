package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Ex250423 {
	public static void main(String[] args) {
		//use Map to calculate the frequency of a char
		String str = "aaaaabbbbcccddddd";
		Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
        	String str2 = (String.valueOf(str.charAt(i)));
            if (map.containsKey(str2)) {
                map.put(str2, map.get(str2) + 1);
            } else {
                map.put(str2, 1);
            }
        }
        System.out.println(map);
    }
}
