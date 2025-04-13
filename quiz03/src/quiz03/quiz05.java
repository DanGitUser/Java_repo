package quiz03;

public class quiz05 {
	public static void main(String[] args) {
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println("Sum of even num : " + evenSum);
		System.out.println("Sum of odd num : " + oddSum);
	}
}