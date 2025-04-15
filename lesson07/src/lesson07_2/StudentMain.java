package lesson07_2;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student();
		Student stu = new Student("John", 4, "Software Dev");
		
		System.out.println(stu.name);
		System.out.println(stu.grade);
		System.out.println(stu.department);
	}
}
