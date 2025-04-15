package student;

// Data class
public class Student {
	// 1. StudentMain의 나머지 기능 구현(메세지 출력)
	// 2. Student의 생성자 구현
	// 기본생성자 + (학번,이름), (다섯개의필드를 다 사용)
	
	int no;
	int kor;
	int eng;
	int mat;
	
	String name;
	String department;
	
	Student() {}
	
	Student(int no, String name, String department, int kor, int eng, int mat) {
        this.no = no;
        this.name = name;
        this.department = department;
        
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        
	}
        public void info() {
            System.out.println("학번: \n" + no + ", 이름: \n" + name + ", 학과: \n" + department + 
                               ", 국어: " + kor + ", 영어: " + eng + ", 수학: " + mat);
        }
    }