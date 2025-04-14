package quiz03;

public class quiz04 {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 5 == 0 ) {
				sum += i;
				System.out.printf("add %d, sum: %d\n", i, sum);
			}
		}
		System.out.println();
		System.out.println("The combined sum of the multiple of 5 is : " + sum);
	}
}
