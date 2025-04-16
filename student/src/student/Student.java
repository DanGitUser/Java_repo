package student;

// Data class
public class Student {
	
	int no;
	String name;
	int kor;
	int eng;
	int mat;
	
	Student() {}
	
	Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	Student(int no, String name, int kor, int eng, int mat) {
		this(no, name);
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	int total() {
		return kor + eng + mat;
	}
	// 평균 계산 double type
	double avg() {
		return (kor + eng + mat) / 3d;
	}
	
}