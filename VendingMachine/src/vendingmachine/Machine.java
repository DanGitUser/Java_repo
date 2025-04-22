package vendingmachine;

public class Machine {
	//How to use get and set
	//1. field
	//2. constructor
	//3. getter / setter
    private int no;
    private String name;
    private int kor;
    private int eng;
    private int mat;
    
    public Machine(int no, String name, int kor, int eng, int mat) {
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

    @Override
    public String toString() {
        return String.format("%5d %5s %5d %5d %5d %6.2f %5d", no, name, kor, eng, mat, avg(), total());
    }
}
