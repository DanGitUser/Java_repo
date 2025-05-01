package student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unchecked")
public class StudentService {

	private List<Student> students = new ArrayList<Student>();
	private List<Student> sortedStudents;

	{
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("data/student.ser"));
			students = (List<Student>)ois.readObject();
			ois.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found, Applying Temp Data");
		students.add(Student.builder().no(1).name("개똥이")
				.kor(randomScore())
				.eng(randomScore())
				.mat(randomScore())
				.build());	
		students.add(Student.builder().no(1).name("새똥이")
				.kor(randomScore())
				.eng(randomScore())
				.mat(randomScore())
				.build());
		students.add(Student.builder().no(1).name("말똥이")
				.kor(randomScore())
				.eng(randomScore())
				.mat(randomScore())
				.build());
		students.add(Student.builder().no(1).name("소똥이")
				.kor(randomScore())
				.eng(randomScore())
				.mat(randomScore())
				.build());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}	
		sortedStudents = new ArrayList<Student>(students);
		rank();
	}
	
	
	private static StudentService studentService = new StudentService();
	private StudentService() {}
	public static StudentService getInstance() {
		return studentService;
	}

	public static int randomScore() {
		return (int) (Math.random() * 41 + 60);
	}

	Student findBy(int no) {
		for (Student student : students) {
			if (student.getNo() == no) {
				return student;
			}
		}
		return null;
	}

	public int checkRange(String subject, int input, int start, int end) {
		if (input < start || input > end) {
			throw new IllegalArgumentException(subject + " " + start + " ~ " + end + " 사이");
		}
		return input;
	}

	public int checkRange(String subject, int input) {
		return checkRange(subject, input, 0, 100);
	}

	// 등록
	public void register() {
		System.out.println("등록 기능");
		int no = StudentUtils.nextInt("학번 > ");

		if (findBy(no) != null) {
			System.out.println("중복된 학번이 존재합니다");
			return;
		}

		String name = inputName();

		int kor = checkRange("국어", StudentUtils.nextInt("국어 > "));
		int eng = checkRange("영어", StudentUtils.nextInt("영어 > "));
		int mat = checkRange("수학", StudentUtils.nextInt("수학 > "));

		Student newStudent = new Student(no, name, kor, eng, mat);
		students.add(newStudent);
		sortedStudents.add(newStudent);
		rank();
		save();
	}

	// 조회
	public void read() {
		System.out.println("조회 기능");
		print(students);
	}

	public void readOrder() {
		System.out.println("석차순 조회 기능");
		print(sortedStudents);
	}

	public void print(List<Student> stu) {
		stu.forEach(s -> System.out.println(s));
	}

	// 이름 검증 문자열 체크를 정규표현식을 사용
	public String inputName() {
		String name = StudentUtils.nextLine("이름 > ");
		if (!name.matches("^[가-힣]{2,4}$")) {
			throw new IllegalArgumentException("이름은 한글, 2~4글자만 가능합니다.");
		}
		return name;
	}

	// 수정
	public void modify() {
		System.out.println("수정 기능");
		int no = StudentUtils.nextInt("수정할 학생의 학번 > ");
		Student s = findBy(no);
		if (s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}

		s.setName(inputName());
		s.setKor(checkRange("국어", StudentUtils.nextInt("국어 > ")));
		s.setEng(checkRange("영어", StudentUtils.nextInt("영어 > ")));
		s.setMat(checkRange("수학", StudentUtils.nextInt("수학 > ")));

		rank();
		save();
	}

	// 삭제
	public void remove() {
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("삭제할 학생의 학번 > ");
		Student s = findBy(no);
		if (s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		students.remove(s);
		sortedStudents.remove(s);
		save();
	}

	public void allAvg() {
		// 국어, 영어, 수학, 전체평균
		if (students.size() == 0) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		}

		int size = students.size();

		double avgKor = students.stream().map(s -> s.getKor()).reduce(0, Integer::sum) / (double) size;
		double avgEng = students.stream().map(s -> s.getEng()).reduce(0, Integer::sum) / (double) size;
		double avgMat = students.stream().map(s -> s.getMat()).reduce(0, Integer::sum) / (double) size;
		double avgAll = (avgKor + avgEng + avgMat) / 3d;

		System.out.println(students.size() + " 명의 학생 평균");
		System.out.printf("국어 평균: %.2f\n", avgKor);
		System.out.printf("영어 평균: %.2f\n", avgEng);
		System.out.printf("수학 평균: %.2f\n", avgMat);
		System.out.printf("전체 평균: %.2f\n", avgAll);
	}

	public void rank() {
		if (students.size() == 0) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		}
//		Collections.sort(sortedStudents, (o1, o2) -> o2.total() - o1.total());
		sortedStudents.sort((s1, s2) -> s2.total() - s1.total());
	}
	
	private void save() {
		try {
			File file = new File("data");
			if (!file.canExecute()) {
				file.mkdirs(); //folder generation
			}
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(file, "student.ser")));
			oos.writeObject(students);
			oos.close();
		} 
		catch (IOException e) {
			System.out.println("Restricted File Access");
			e.printStackTrace();
		}
	}

}