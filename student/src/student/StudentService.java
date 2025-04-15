package student;

import java.util.Scanner;

public class StudentService {
	Student[] students = new Student[10];
    int count = 0;
    Scanner scanner = new Scanner(System.in);
	
	// 등록
	void register() {
		System.out.println("이름: ");
        String name = scanner.nextLine();
        
        System.out.println("학과: ");
        String department = scanner.nextLine();
        
        System.out.println("학번: ");
        int no = scanner.nextInt();
        
		System.out.println("국어 점수 : ");
		int kor = scanner.nextInt();
		
		System.out.println("영어 점수 : ");
		int eng = scanner.nextInt();
		
		System.out.println("수학 점수 : ");
		int mat = scanner.nextInt();
		
		students[count++] = new Student(count, name, department, kor, eng, mat);
        System.out.println("학생이 등록되었습니다.");
	}
	// 조회
	void read() {
		System.out.println("학생 조회 기능");
		for (int i = 0; i < count; i++) {
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