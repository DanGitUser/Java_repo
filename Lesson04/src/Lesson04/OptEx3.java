package Lesson04;

public class OptEx3 {
	public static void main(String[] args) {
		// Ight, basically, there are these things called "Operators"
		// or 연산자 in Korean. These are used to perform operations,
		// be it mathematical or simple command.
		// (? :) is used to like this 
		// ("variable" ? (whater here is true) : (and this false))
		int score = 80;
		String pass = score >= 60 ? "Pass" : "Fail";
		System.out.println(pass);
		
		// compound substitution operator
		// 복합 대입 연산자
		// += -= *= /= %=
		String str = "";
		str += "additional string\n";
		str += "additional cheese";
		System.out.println(str);
		
	}
}
