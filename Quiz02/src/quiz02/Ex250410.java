package quiz02;
//1.사과 과일 세기
//10 apples per 1 box
//there are 123 apples, how many boxes are needed?
//연산자만 사용

//2.합게 구하기
//1 + (-2) + 3 + (-4) .. (-98) + 99 + (-100)
//반복문 사용

//3. Prime Number
//pre determined number is a prime number or not.

public class Ex250410 {
	public static void main(String[] args) {
		/*
		int apple = 123;
		int box = 10;
		System.out.println((apple + 9) / box);
		*/
		/*
		int sum = 0;
		for (int i = 1; i <= 100; i++ ) {
			/*
			if(i % 2 == 0) {
				sum += i;
			}
			else {
				sum += i;
			}
			
			sum += i % 2 == 0 ? -i : i;
		}
		System.out.println(sum);
		*/
		
		int num = 13;
		int count = 0;
		for(int i = 2 ; i <= num ; i++) {
			System.out.printf("%d : %d >> %s\n", i, num % i, num % i == 0 ? "약수" : "약수아님");
		}
		System.out.println(count == 0 ? "소수" : "소수아님");
	}
}
