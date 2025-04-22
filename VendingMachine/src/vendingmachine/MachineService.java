package vendingmachine;

import java.util.Arrays;

public class MachineService {
	// 1. 모든 필드, 메서드, 생성자 > 접근제한자
	// 2. 어떤 값을 입력하더라도 예외 처리 (프로그램 종료는 정상종료)
	// 3. 점수값 입력의 범위 0~100 사이만 인정
	// 4. 이름 입력은 한글만 인정, 2글자~4글자사이
	// 5. 임시데이터의 점수값을 랜덤으로 배정(60~100)
	
	// 도형 과제 추가
	// 삼각형, 3차원도형 추가 구현
	
	private	Machine[] machine = new Machine[4];
	private	Machine[] sortedMachine = new Machine[machine.length];
	private	int count;

	{
		machine[count++] = new Machine(1, "개똥이", randomScore(), randomScore(), randomScore());
		machine[count++] = new Machine(2, "새똥이", randomScore(), randomScore(), randomScore());
		machine[count++] = new Machine(3, "말똥이", randomScore(), randomScore(), randomScore());
		machine[count++] = new Machine(4, "소똥이", randomScore(), randomScore(), randomScore());
		
		sortedMachine = machine.clone();
		rank();
	}
	public int randomScore() {
		return (int)(Math.random() * 41 + 60);
	}
	
	
	// 입력 : 학번
	// 출력 : 학생
	Machine findBy(int no) {
		Machine student = null;
		for(int i = 0 ; i < count ; i++) {
			if(machine[i].getNo() == no) {
				student = machine[i];
				break;
			}
		}
		return student;
	}
	public int checkRange(String subject, int input, int start, int end) {
		if (input < start || input > end) {
			throw new IllegalArgumentException(subject + "0 ~ 100 사이");
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
		
		int kor = MachineUtil.nextInt("국어 > ");
		checkRange("국어", kor);
		int eng = MachineUtil.nextInt("영어 > ");
		checkRange("영어", eng);
		int mat = MachineUtil.nextInt("수학 > ");
		checkRange("수학", mat);
		if(machine.length == count) {
			machine = Arrays.copyOf(machine, machine.length * 2);
		}
		machine[count++] = new Machine(no, name, kor, eng, mat);
		sortedMachine = Arrays.copyOf(machine, machine.length);
		rank();
	}
	// 조회
	public void read() {
        System.out.println("조회 기능");
        print(machine);
    }
	public void readOrder() {
		System.out.println("석차순 조회 기능");
		print(sortedMachine);
	}
	
	public void print(Machine[] stu) {
        for (int i = 0; i < count; i++) {
            System.out.println(stu[i]);
		}
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
		s.setKor(checkRange("국어", MachineUtil.nextInt("국어 > ")));
		s.setEng(checkRange("영어", MachineUtil.nextInt("영어 > ")));
		s.setMat(checkRange("수학", MachineUtil.nextInt("수학 > ")));
		sortedMachine = Arrays.copyOf(machine, machine.length);
		rank();	
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
		
		for(int i = 0 ; i < count ; i++) {
			if(machine[i].getNo() == no) {
				System.arraycopy(machine, i+1, machine, i, count-- - 1 - i);
				break;
			}
		}
		sortedMachine = Arrays.copyOf(machine, machine.length);
		rank();
	}
	
	public void allAvg() {
		// 국어, 영어, 수학, 전체평균
		if (count == 0) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
		
		double avgKor = 0;
		double avgEng = 0;
		double avgMat = 0;
		double avgAll = 0;
		
		// count
		
		for(int i = 0 ; i < count ; i++) {
			avgKor += machine[i].getKor(); 
			avgEng += machine[i].getEng(); 
			avgMat += machine[i].getMat(); 
		}
		avgKor /= (double)count;
		avgEng /= (double)count;
		avgMat /= (double)count;
		
		avgAll = (avgKor + avgEng + avgMat) / 3; 
		
		System.out.println(count + "명의 학생 평균");
		System.out.println("국어 평균 " + avgKor);
		System.out.println("영어 평균 " + avgEng);
		System.out.println("수학 평균 " + avgMat);
		System.out.println("전체 평균" + avgAll);
		
	}
	
	public void rank() {
		
		for(int i = 0 ; i < count - 1; i++ ) {
			int idx = i;
			for(int j = 1 + i ; j < count ; j++) {
				if(sortedMachine[idx].total() < sortedMachine[j].total()) {
					idx = j;
				}
			}
			Machine tmp = sortedMachine[i];
			sortedMachine[i] = sortedMachine[idx];
			sortedMachine[idx] = tmp;
		}		
	}
	
}
