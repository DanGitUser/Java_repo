package student;

public class Test {
	public static void main(String[] args) {
		Student student = new Student(1, "새똥이");
		Student s = m1(student);
		
	}
	
	static Student m1(Student student) {
		student.setKor(50);
		return student;
	}
	static void m2(Student student) {
		student.setKor(70);

	}
	
	static int m3(int i) {
		System.out.println(i*i);
		return i*i;
	}
	
	static void m4(int i) {
		System.out.println(i*i);
	}
}
