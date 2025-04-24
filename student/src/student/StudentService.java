package student;

//학생 예제 내의 배열을 리스토로
//이름 검증 문자열 체크를 정규표현식을 사용

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class StudentService {

	private List<Student> students = new ArrayList<Student>();
	private List<Student> sortedStudents;

	{
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
		
		sortedStudents = new ArrayList<Student>(students);
		rank();
	}
	
	
	private static StudentService studentService = new StudentService();
	private StudentService() {
		
	}
	public static StudentService getInstance() {
		return studentService;
	}

	public static int randomScore() {
		return (int) (Math.random() * 41 + 60);
	}

	// 입력 : 학번
	// 출력 : 학생
	Student findBy(int no) { // what dad keeps saying
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
		sortedStudents.sort((s1, s2) -> s2.total() - s1.total());
	}

}