package student;

import java.util.Iterator;

public class StudentService {
	Student[] students = new Student[2];
	int count;
	
	// 2. 수정 및 삭제 구현
	// 3. 배열의 길이를 넘는 추가 학생 등록시 배열 길이 늘리기
	
	// 등록
	void register() {
		System.out.println("등록 기능");
        if (count >= students.length) {
            Student[] newStudents = new Student[students.length * 2];
            System.arraycopy(students, 0, newStudents, 0, students.length);
            students = newStudents;
        }
		// 학생 생성
		// 학번, 이름, 국어, 영어, 수학
		int no = StudentUtils.nextInt("학번 > ");
		String name = StudentUtils.nextLine("이름 > ");
		
		int kor = StudentUtils.nextInt("국어 > ");
		int eng = StudentUtils.nextInt("영어 > ");
		int mat = StudentUtils.nextInt("수학 > ");
		students[count++] = new Student(no, name, kor, eng, mat);
	}
	// 조회
	void read() {
		System.out.println("조회 기능");
		for(int i = 0 ; i < count ; i++) {
			System.out.println("학번: " + students[i].no + ", " + ", 이름: " + students[i].name + ", "
							+ "\n점수합 :" + students[i].total() + "\n평균 :" + students[i].avg()+ "\n");
		}
	}
	// 수정
	void modify() {
		System.out.println("수정 기능");
		int no = StudentUtils.nextInt("수정할 학번 > ");
		for (int i = 0; i < count; i++) {
			if (students[i].no == no ) {
		          String name = StudentUtils.nextLine("이름 > ");
		            int kor = StudentUtils.nextInt("국어 > ");
		            int eng = StudentUtils.nextInt("영어 > ");
		            int mat = StudentUtils.nextInt("수학 > ");
		            students[i] = new Student(no, name, kor, eng, mat);
		            System.out.println("수정되었습니다.");
		        }
		    }
		    System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
	}
	// 삭제
	void remove() {
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("삭제할 학번 > ");
		for (int i = 0; i < count; i++) {
			if (students[i].no == no ) {
				System.arraycopy(students, i + 1, students, i, count - i - 1);
//		         for (int j = i; j < count - 1; j++) {
//					students[j] = students[j + 1];
//				}
		         students[count - 1] = null; 
		            count--;
		            System.out.println("삭제되었습니다.");
		            return;
		        }
		    }
		    System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
	}
}