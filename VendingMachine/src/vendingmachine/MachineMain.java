package vendingmachine;

public class MachineMain {
	public static void main(String[] args) {
		
		MachineService service = new MachineService();
		System.out.println("================== 왭 스토어 관리 프로그램 ==================");

		for (;;) {
			try {
				int choice = MachineUtil.nextInt("\n1. 등록 2. 조회 3. 수정 4. 삭제 5. 구매 순위 조회 6. 종료 > ");
				switch (choice) {
				case 1:
					service.register();
					break;
				case 2:
					service.read();
					break;
				case 3:
					service.modify();
					break;
				case 4:
					service.remove();
					break;
				case 5:
					service.topSale();
					break;
				case 6:
					System.out.println("Bye~!");
					return;
				default:
					System.out.println("1 ~ 7 사이의 숫자를 입력");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력");
			} catch (IllegalArgumentException e) {
				System.out.println("잘못된 입력");
			}
		}
	}
}
