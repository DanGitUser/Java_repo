package quiz;

public class Quiz02 {
	public static void main(String[] args) {
		//[문제 2] 나머지 계산
		//컵케이크 23개를 4명이 나눠 가질 때, 
		//남는 컵케이크의 개수를 출력하는 코드를 작성하시오.
		int cupc = 23;
		int ppl = 4;
		int result = cupc % ppl;
		System.out.println("consumed cupcakes per ppl:\n" + result);
	}
}
