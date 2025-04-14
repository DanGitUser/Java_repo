package lesson07;

public class MembeMain {
	
	public static void main(String[] args) {
		
		Member m = new Member();
		m.num = 1;
		m.name = "JangSangHyun";
		m.age = 28;
		
		Member m2 = new Member();
		m2.num = 2;
		m2.name = "KimJiYu";
		m2.age = 22;
		
		m2 = m;
		m2.age = 30;
		m.num = 3;
		
		System.out.println(m.num);
		System.out.println(m.name);
		System.out.println(m.age);
		
		System.out.println(m2.num);
		System.out.println(m2.name);
		System.out.println(m2.age);
		
		
		if (m == m2) {
			System.out.println("m and m2 are the same");
		} else {
			System.out.println("m and m2 are different");
		}
		
	}
}
