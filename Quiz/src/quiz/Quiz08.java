package quiz;

public class Quiz08 {
	public static void main(String[] args) {
//		[문제 8] 조건 판별식
//		다음 조건을 만족하면 true를 출력하는 코드를 작성하시오.
//
//		나이가 20세 이상이고
//
//		회원가입이 완료되어 있어야 함
//
		int age = 21;
		boolean isRegistered = true;
		boolean isAboveAge = age >= 20;
		boolean canEnter = isRegistered && isAboveAge;
		
		System.out.println("Can this person enter?\n" +canEnter);
	}
}
