package student;

public class StudentMain {
    public static void main(String[] args) {
//    	String s = "한국어";
//    	System.out.println(s.length());
//    	System.out.println(s.charAt(1));
        StudentService service = new StudentService();
        System.out.println("================== 학생 점수 관리 프로그램 ==================");

        for (;;) {
            try {
                int choice = StudentUtils.nextInt("\n1. 등록 2. 조회 3. 수정 4. 삭제 5. 과목별 평균\n6. 석차순 조회 7. 종료 > ");
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
                        service.allAvg();
                        break;
                    case 6:
                        service.readOrder();
                        break;
                    case 7:
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
