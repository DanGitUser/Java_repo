package lesson;

public class a369 {
	public static void main(String[] args) {
/*		int a = 12;
		int b = 18;
		int gcd = 0;
		for(int i = 1 ; i <= a ; i++) {
				for(int j = 1 ; j <= b ; j++) {
					if(a % i == 0 && b % j ==0 && i == j) {
						gcd = i;
						
				}
			}
		}
		System.out.println(gcd);
	}
}
*/
 		for (int i = 1; i <= 50; i++) {
			boolean a = false;
			boolean b = false;
			
			int result = i % 10;
			if (result == 3 || result == 6 || result == 9) {
				a = true;
			}

			result = i / 10;
			if (result == 3 || result == 6 || result == 9) {
				b = true;
			}
			if (a && b == true) {
				System.out.println("짝짝 ");
			} 
			else if (a || b == true) {
				System.out.println("짝 ");
			} 
			else {
				System.out.println(i + " ");
			}
		}
		System.out.println("======================");
	}
}	