package lesson07_3;


public class Access {
	public static void main(String[] args) {
		Target target = new Target();
		System.out.println(target.getI());
		target.setI(30);
		System.out.println(target.getI());
	}
}

class Target {
	private int i = 20;
	
	//getter
	public int getI() {
		return i;
	}
	//setter
	public void setI(int i) {
		this.i = i;
	}
}
