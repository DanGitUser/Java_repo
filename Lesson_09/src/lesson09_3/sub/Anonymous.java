package lesson09_3.sub;

import java.util.Arrays;
import java.util.Comparator;

public class Anonymous {
	public static void main(String[] args) {
		//anonymous name
		Runnable runnable = new Runnable() {
			int i = 20;
			static int si = 20;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Run");
			}
			void m() {
				System.out.println(i);
			}
			void m2(int i) {
				i = 20;
			}
		}; 	
		runnable.run();
		Outer outer = new Outer() {
			void m() {
				System.out.println("Override Method");
			}
		};
		outer.m();
		
		
		Integer[] arr = {1,5,3,2,4,1};
		
		Comparator<Integer> iter = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		};
		
		Arrays.sort(arr, iter);
		System.out.println(Arrays.toString(arr));
		
	}
}
