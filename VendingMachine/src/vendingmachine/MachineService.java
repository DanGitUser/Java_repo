package vendingmachine;

import java.util.List;
import java.util.ArrayList;

public class MachineService {
	// 1. 모든 필드, 메서드, 생성자 > 접근제한자
	// 2. 어떤 값을 입력하더라도 예외 처리 (프로그램 종료는 정상종료)
	// 3. 점수값 입력의 범위 0~100 사이만 인정
	// 4. 이름 입력은 한글만 인정, 2글자~4글자사이
	// 5. 임시데이터의 점수값을 랜덤으로 배정(60~100)
	
	// 도형 과제 추가
	// 삼각형, 3차원도형 추가 구현
	
	private	List<Machine> machine = new ArrayList<Machine>();
	private	List<Machine> sortedMachine;

	{
		machine.add(new Machine(1, "개똥이", randomScore(), randomScore()));
		machine.add(new Machine(2, "새똥이", randomScore(), randomScore()));
		machine.add(new Machine(3, "말똥이", randomScore(), randomScore()));
		machine.add(new Machine(4, "소똥이", randomScore(), randomScore()));
		
		sortedMachine = machine = new ArrayList<Machine>();
	}
	public int randomScore() {
		return (int)(Math.random() * 41 + 60);
	}
	
	
	// 입력 : 학번
	// 출력 : 학생
	Machine findBy(int no) {
		for(Machine machine : machine) {
			if(machine.getNo() == no) {
				return machine;
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
		return checkRange(subject, input, 0, 100) ;
	}
	
	// 등록
	public void register() {
		System.out.println("등록 기능");
		int no = MachineUtil.nextInt("학번 > ");
		
		Machine s = findBy(no);
		
		if(s != null) {
			System.out.println("중복된 학번이 존재합니다");
			return;
		}
		
		String name = inputName();

		int saleC = checkRange("국어", MachineUtil.nextInt("국어 > "));
		int saleP = checkRange("영어", MachineUtil.nextInt("영어 > "));

		Machine newStudent = new Machine(no, name, saleC, saleP);
		machine.add(newStudent);
		sortedMachine.add(newStudent);
	}
	// 조회
	public void read() {
        System.out.println("조회 기능");
        print(machine);
    }
	public void topSale() {
		System.out.println("석차순 조회 기능");
		print(sortedMachine);
	}
	
	public void print(List<Machine> mach) {
        mach.forEach(s -> System.err.println(s));
	}
	
	public String inputName() {
		String name = MachineUtil.nextLine("이름 > ");
		if (name.length() < 2 || name.length() > 4) {
			throw new IllegalArgumentException("2 ~ 4 글짜");
		}
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i) < '가' || name.charAt(i)> '힣') {
				throw new IllegalArgumentException("한글만");
			}
		}
		return name;
	}
	
	// 수정
	public void modify() {
		System.out.println("수정 기능");
		// 학생들 배열에서 입력받은 학번과 일치하는 학생
		int no = MachineUtil.nextInt("수정할 학생의 학번 > ");
		Machine s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		String name = MachineUtil.nextLine("이름 > ");
		s.setName(name);
		s.setC(checkRange("국어", MachineUtil.nextInt("국어 > ")));
		s.setP(checkRange("영어", MachineUtil.nextInt("영어 > ")));
	}
	// 삭제
	public void remove() {
		System.out.println("삭제 기능");
		int no = MachineUtil.nextInt("삭제할 학생의 학번 > ");
		Machine s = findBy(no);
		if(s == null) {
			System.out.println("입력된 학번이 존재하지 않습니다");
			return;
		}
		machine.remove(s);
		sortedMachine.remove(s);
	}	
}
