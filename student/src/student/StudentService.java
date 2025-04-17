package student;

import java.util.Arrays;

public class StudentService {
	Student[] students = new Student[2];
	int count;

    void register() {
        System.out.println("등록 기능");
        int no = StudentUtils.nextInt("학번 > ");   
        for (int i = 0; i < count; i++) {
            if (students[i].no == no) {
                System.out.println("이미 존재하는 학번입니다.");
                return;
            }
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

    void read() {
        System.out.println("조회 기능");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    void modify() {
        System.out.println("수정 기능");
        int no = StudentUtils.nextInt("수정할 학번 > ");
        for (int i = 0; i < count; i++) {
            if (students[i].no == no) {
                String name = StudentUtils.nextLine("이름 > ");
                int kor = StudentUtils.nextInt("국어 > ");
                int eng = StudentUtils.nextInt("영어 > ");
                int mat = StudentUtils.nextInt("수학 > ");
                students[i] = new Student(no, name, kor, eng, mat);
                System.out.println("수정되었습니다.");
                return;
            }
        }
        System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
    }

    void calcAvg() {
        if (count == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        double totalKor = 0, totalEng = 0, totalMat = 0;

        for (int i = 0; i < count; i++) {
            totalKor += students[i].kor;
            totalEng += students[i].eng;
            totalMat += students[i].mat;
        }

        System.out.println("국어 평균: " + (totalKor / count));
        System.out.println("영어 평균: " + (totalEng / count));
        System.out.println("수학 평균: " + (totalMat / count));
    }

    void sortStu() {
        if (count == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (students[j].total() < students[j + 1].total()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("학생 성적 순위:");
        for (int i = 0; i < count; i++) {
            System.out.println("순위: " + (i + 1) + ", " + students[i]);
        }
    }

    void remove() {
        System.out.println("삭제 기능");
        int no = StudentUtils.nextInt("삭제할 학번 > ");
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].no == no) {
                System.arraycopy(students, i + 1, students, i, count-- - 1 - i);
                System.out.println("삭제되었습니다.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
        }
    }
}

// 1. Prevent duplicate student ID
// 2. find the average between all grade types + average between all grades.
// 3. Sort by best grade (overall)
// 4. Student Class -> toString re write //상속 마지막