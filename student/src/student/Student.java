package student;

import java.lang.module.ModuleDescriptor.Builder;

public class Student implements Comparable {
	// How to use get and set
	// 1. field
	// 2. constructor
	// 3. getter / setter
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;

	public Student(int no, String name, int kor, int eng, int mat) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int total() {
		return kor + eng + mat;
	}

	public double avg() {
		return total() / 3.0;
	}

	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", no, name, kor, eng, mat, avg(), total());
	}

	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}

	public static Builder builder() {
		return new Builder();
	}

	static class Builder {
		private int no;
		private String name;
		private int kor;
		private int eng;
		private int mat;

		public Builder no(int no) {
			this.no = no;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder kor(int kor) {
			this.kor = kor;
			return this;
		}
		public Builder eng(int eng) {
			this.eng = eng;
			return this;
		}
		public Builder mat(int mat) {
			this.mat = mat;
			return this;
		}

		public Student build() {
			return new Student(this);
		}
	}

	private Student(Builder builder) {
		this.no = builder.no;
		this.name = builder.name;
		this.kor = builder.kor;
		this.eng = builder.eng;
		this.mat = builder.mat;
	}

	public static void main(String[] args) {
		Student student = Student
				.builder()
				.no(1).name("새똥이").kor(90)
				.build();
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}