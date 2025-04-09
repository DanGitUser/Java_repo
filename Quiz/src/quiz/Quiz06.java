package quiz;

public class Quiz06 {
	public static void main(String[] args) {
//		[문제 6] 티켓 검사
//		hasID = true, hasTicket = false인 상태에서
//		두 조건이 모두 만족되어야 입장할 수 있도록
//		canEnter의 값을 boolean으로 출력하시오.
		boolean hasID = true;
		boolean hasTicket = false;
		boolean canEnter = hasID && hasTicket;
		
		System.out.println("can they enter: " +canEnter);
	}
}
