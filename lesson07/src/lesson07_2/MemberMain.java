package lesson07_2;

public class MemberMain {
	public static void main(String[] args) {
		
		//adress to be made later by 'this'
		Member m = new Member(20);
		System.out.println(m.num);
		System.out.println(m);
		Member member = m.m1();
		System.out.println(member);
		m.m2(m);
		
	}
}
class Member {
	int num = 10;
	Member(int num) {
		this.num = num; //constructor type
	}
	Member m1() { //return type = output type
		return this; //method type, but same as class type
	}
	void m2(Member m) { //input type
		System.out.println(m);
	}
}