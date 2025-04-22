package student;

//학생 예제 내의 배열을 리스토로
//이름 검증 문자열 체크를 정규표현식을 사용

import java.util.ArrayList;
import java.util.List;

public class StudentService {

	private List<Student> students = new ArrayList<Student>();
	private List<Student> sortedStudents = new ArrayList<Student>();

	{
		students.add(new Student(1, "개똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student(2, "새똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student(3, "말똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student(4, "소똥이", randomScore(), randomScore(), randomScore()));

		sortedStudents.addAll(students);
		rank();
	}

	public int randomScore() {
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
		for (Student student : stu) {
			System.out.println(student);
		}
	}

	// 이름 검증 문자열 체크를 정규표현식을 사용
	public String inputName() {
		String name = StudentUtils.nextLine("이름 > ");
		String pattern = "^[가-힣]{2,4}$";

		if (!name.matches(pattern)) {
			throw new IllegalArgumentException("이름은 한글, 2~4글자만 가능합니다.");
		}
		return name;
	}

//	public String inputName() {
//		String name = StudentUtils.nextLine("이름 > ");
//		String krChar = "[가-힣]*";
//		String nameLength = "[가-힣]{2,4}";
//		if(!(name.matches(nameLength))) {
//			throw new IllegalArgumentException("이름은 한글로 구성되어야합니다");
//		}
//		else if(!(name.matches(krChar))) {
//			throw new IllegalArgumentException("이름은 2~4글자로 입력하세요");
//		}
//		return name;
//	}

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
		
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getNo() == no) {
				students.remove(i);
				System.out.println("학생이 성공적으로 삭제되었습니다.");
				break;
			}
		}
		rank();
	}

	public void allAvg() {
		// 국어, 영어, 수학, 전체평균
		if (students.size() == 0) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		}

		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;

		// count

		for (int i = 0; i < students.size(); i++) {
			avgKor += students.get(i).getKor();
			avgEng += students.get(i).getEng();
			avgMat += students.get(i).getMat();
		}
		avgKor /= (double) students.size();
		avgEng /= (double) students.size();
		avgMat /= (double) students.size();

		avgAll = (avgKor + avgEng + avgMat) / 3;

		System.out.println(students.size() + "명의 학생 평균");
		System.out.println("국어 평균 " + avgKor);
		System.out.println("영어 평균 " + avgEng);
		System.out.println("수학 평균 " + avgMat);
		System.out.println("전체 평균" + avgAll);

	}

	public void rank() {

		for (int i = 0; i < students.size() - 1; i++) {
			int idx = i;
			for (int j = 1 + i; j < students.size(); j++) {
				if (sortedStudents.get(idx).total() < sortedStudents.get(j).total()) {
					idx = j;
				}
			}
			Student tmp = sortedStudents.get(i);
			sortedStudents.set(i, sortedStudents.get(idx));
			sortedStudents.set(idx, tmp);
		}
	}

}