package quiz;

public class Quiz07 {
	public static void main(String[] args) {
//		[문제 7] 평균 점수 구하기
//		세 과목의 점수가 각각 80, 90, 70일 때,
//		평균 점수를 계산하여 출력하는 코드를 작성하시오.
//		(단, 소수점 처리는 하지 않아도 됨)
		int mat = 80;
		int sci = 80;
		int eng = 70;
		int avg = (mat + sci + eng) / 3;
		System.out.println("The average is: " +avg);

	}
}
