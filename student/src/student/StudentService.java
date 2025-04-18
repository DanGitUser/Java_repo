package student;

import java.util.Arrays;

public class StudentService {
	//1.모든 필드, 매서드, 생성자 > 접근제한자 ok
	//2. 어떤 값을 입력하더라도 예외 처리 (프로그램 종료는 정상종료)
	//3. 점수값 입력의 범위 0~100 사이만 인정
	//4. 이름 입력은 한글만 인정, 2글자 ~ 4글자 사이
	//5. 임시 데이터의 점수값을 랜덤으로 배정(60 ~ 100)
	
	Student[] students = new Student[4];
	Student[] sortedStudents = new Student[students.length];
	int count;
	
	{
		students[count++] = new Student(1, "Dung", 90, 70, 60);
		students[count++] = new Student(2, "Dung2", 95, 75, 60);
		students[count++] = new Student(3, "Dung3", 70, 70, 60);
		
		sortedStudents = students.clone();
	}

	Student findBy(int no) {
		Student student = null;
        for (int i = 0; i < count; i++) {
            if (students[i].no == no) {
                System.out.println("이미 존재하는 학번입니다.");
                break;
            }
        }
        return student;
	}
	
    public void register() {
        System.out.println("등록 기능");
        int no = StudentUtils.nextInt("학번 > ");   
        
        Student s = findBy(no);
        
        if(s != null) {
        	System.out.println("증복 존재");
        	return;
        }

        String name = StudentUtils.nextLine("이름 > ");
        int kor = StudentUtils.nextInt("국어 > ");
        int eng = StudentUtils.nextInt("영어 > ");
        int mat = StudentUtils.nextInt("수학 > ");
        
        if (students.length == count) {
            students = Arrays.copyOf(students, students.length * 2);
        }
        students[count++] = new Student(no, name, kor, eng, mat);
    }

    public void read() {
        System.out.println("조회 기능");
        print(students);
    }
    public void readOrder() {
    	System.out.println("석차순 조회 기능");
        print(sortedStudents);
    }
    
    public void print(Student[] stu) {	
    	for (int i = 0; i < count; i++) {
    		System.out.println(stu[i]);
    	}
    }

	public void modify() {
		System.out.println("수정 기능");
		// 학생들 배열에서 입력받은 학번과 일치하는 학생
		int no = StudentUtils.nextInt("수정할 학생의 학번 > ");
		Student s = findBy(no);
//		if(s == null) {
//			System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
//			return;
//		}
		s.name = StudentUtils.nextLine("이름 > ");
		s.kor = StudentUtils.nextInt("국어 > ");
		s.eng = StudentUtils.nextInt("영어 > ");
		s.mat = StudentUtils.nextInt("수학 > ");		
    }

    public void calcAvg() {
        if (count == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        double totalKor = 0, totalEng = 0, totalMat = 0, avgAll = 0;
        
        for (int i = 0; i < count; i++) {
            totalKor += students[i].kor;
            totalEng += students[i].eng;
            totalMat += students[i].mat;
        }
        totalKor /= (double)count;
        totalEng /= (double)count;
        totalMat /= (double)count;

        avgAll = (totalKor + totalEng + totalMat) / 3d;
        
        System.out.println(count + ": total students");
        System.out.println("국어 평균: " + (totalKor / count));
        System.out.println("영어 평균: " + (totalEng / count));
        System.out.println("수학 평균: " + (totalMat / count));
        System.out.println("학생 평균: " + (avgAll / count));
    }

    public void sortStu() {
        if (count == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        
		for (int i = 0; i < count - 1; i++) {
			int idx = i;
			for (int j = 1 + i; j < count; j++) {
				if(sortedStudents[idx].total() > sortedStudents[j].total()) {
					idx = j;
					
			}
		}
		Student tmp = sortedStudents[i];
		sortedStudents[i] = sortedStudents[idx];
		sortedStudents[idx] = tmp;	
		}
    }
    

    public void remove() {
        System.out.println("삭제 기능");
        int no = StudentUtils.nextInt("삭제할 학번 > ");
        Student s = findBy(no);
		if(s == null) {
			System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
			return;
		}
        for (int i = 0; i < count; i++) {
            if (students[i].no == no) {
                System.arraycopy(students, i + 1, students, i, count-- - 1 - i);
                System.out.println("삭제되었습니다.");
                break;
            }
        }       
    }
}

// 1. Prevent duplicate student ID
// 2. find the average between all grade types + average between all grades.
// 3. Sort by best grade (overall)
// 4. Student Class -> toString re write //상속 마지막