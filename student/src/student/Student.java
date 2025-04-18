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

    public String toString() {
        return String.format("%5d %5s %5d %5d %5d %6.2f %5d", no, name, kor, eng, mat, avg(), total());
    }
}