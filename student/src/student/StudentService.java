package student;

public class StudentService {
	Student[] students = new Student[10];
    int count = 0;
	
	// 등록
	void register() {

		int no = StudentUtils.nextInt("학번: ");
        String name = StudentUtils.nextLine("이름: ");
        String department = StudentUtils.nextLine("학과: ");
        
		int kor = StudentUtils.nextInt("국어 점수 : ");
		int eng = StudentUtils.nextInt("영어 점수 : ");	
		int mat = StudentUtils.nextInt("수학 점수 : ");
		
		students[count++] = new Student(no, name, department, kor, eng, mat);
        System.out.println("학생이 등록되었습니다.");
	}
	// 조회
	void read() {
		System.out.println("조회 기능");
		for (int i = 0; i < count; i++) {
			System.out.println(students[i].no + ", " + students[i].name + ", " + students[i].total());
			students[i].info();
		}
	}
	// 수정
	void modify() {
		System.out.println("수정 기능");
	}
	// 삭제
	void remove() {
		System.out.println("삭제 기능");
	}
}