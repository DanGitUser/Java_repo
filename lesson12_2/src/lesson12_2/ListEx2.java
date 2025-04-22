package lesson12_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx2 {
	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		list.add("A1");
		list.add("B2");
		list.add("C3");
		
		list.remove(0);
		list.add("A1");
		list.remove("A1");
		list.set(0, "B2");
		list.add(0, "A1");
		
		
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println(list);
		System.out.println(list.size());
	}
}
