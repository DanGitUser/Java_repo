package lesson13_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		System.out.println(lt);
		System.out.println(lt.hashCode());
		System.out.println(lt.getClass());
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		System.out.println("Incremental Addition");
		seqInsert(arrayList);
		seqInsert(linkedList);
//		System.out.println("Incremental Addition");
//		nonSeqInsert(arrayList);
//		nonSeqInsert(linkedList);
		System.out.println("Incremental Deletion");
		nonSeqDelete(arrayList);
		nonSeqDelete(linkedList);
	}
	
	static void seqInsert(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10_000_000; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " : " + (end - start) +"ms");
	}
	static void nonSeqInsert(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 500_000; i++) {
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " : " + (end - start) +"ms");
	}
	static void nonSeqDelete(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 500_000; i++) {
			list.remove(list.size() - 1);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + " : " + (end - start) +"ms");
	}
}
