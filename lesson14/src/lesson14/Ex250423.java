package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Ex250423 {
	public static void main(String[] args) {
		//use Map to calculate the frequency of a char
		String str = "aaaaabbbbcccddddd";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int num = map.get(str.charAt(i)) + 1;
                map.put(str.charAt(i), num);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
