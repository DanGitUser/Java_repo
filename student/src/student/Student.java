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

    double avg() {
        return total() / 3d;
    }

    @Override
    public String toString() {
        return String.format("학번: %d, 이름: %s, 점수합: %d, 평균: %.2f", no, name, total(), avg());
    }
}