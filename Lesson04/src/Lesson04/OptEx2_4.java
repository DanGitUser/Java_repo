package Lesson04;

public class OptEx2_4 {
	public static void main(String[] args) {
		//나누기 계산시
		// A / B = C
		// A : 피제수
		// B : 제수
		// C : 몫
		
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println("Activation");
		System.out.println(-3/0d);
		System.out.println(0/0d);
		System.out.println("End");
		
		// &&, &
		// && When using the stacked AND, the calculation is skipped
		// & single AND will try to calculate
		System.out.println(false && 3/0 == 1);
		
	}
}
