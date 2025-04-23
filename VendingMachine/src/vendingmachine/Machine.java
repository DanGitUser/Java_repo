package vendingmachine;

public class Machine {
	//How to use get and set
	//1. field
	//2. constructor
	//3. getter / setter
    private int no;
    private String name;
    private int saleC;
    private int saleP;
    
    public Machine(int no, String name, int saleC, int saleP) {
        this.no = no;
        this.name = name;
        this.saleC = saleC;
        this.saleP = saleP;

    }

    public int getNo() {
        return no;
    }
    public String getName() {
        return name;
    }
    public int saleCount() { 
    	return saleC; 
    }
    public int salePrice() { 
    	return saleP; 
    }

    public void setNo(int no) {
    	this.no = no;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setC(int saleC) { 
    	this.saleC = saleC; 
    }
    public void setP(int saleP) { 
    	this.saleP = saleP; 
    }

    @Override
    public String toString() {
        return String.format("%5d %5s %5d %5d %5d %6.2f %5d", no, name, saleC, saleP);
    }
}
