package Lesson04;

public class OpEx2 {
	public static void main(String[] args) {
		int a = 5 + 5;
	    System.out.println("5 + 5 = " + a);
	    int b = a - 5;
	    System.out.println("10 - 5 = " + b);
	    int c = b * 5;
	    System.out.println("5 * 2 = " + c);
	    int d = c / 5;
	    System.out.println("10 / 5 = " + a);
	    
	    int e = 10 % 3;
	    System.out.println("10 % 3 = " + e);
	    
	    char ch1 = 'A';
	    ch1 = (char)(ch1 + 1);
	    
	    ch1++;
	    System.out.println(ch1);
	    
	    double val = 1.234567;
	    double val2 = val * (int)100;
	    double val3 = (int)val2 / (double)100;
	    System.out.println(val3);
	    
	    val = val * 100;
	    val = (int)val;
	    val = val / 100;
	    
	    		
	    
	}
}
