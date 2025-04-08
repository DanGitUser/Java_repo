package quiz;

public class Quiz03 {
	public static void main(String[] args) {
		//[문제 3] 입장 조건 확인
		//놀이기구를 타려면 키가 150cm 이상이어야 한다.
		//키가 148cm인 사람이 탈 수 있는지를 boolean으로 출력하시오.
		int height = 148;
		boolean canride = height >= 150;
		System.out.println("Is 148cm able to ride?:" + canride);		
	}
}
