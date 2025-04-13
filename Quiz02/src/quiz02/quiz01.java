package quiz02;

public class quiz01 {
	public static void main(String[] args) {
		
		int colorPen = 5 * 12;
		int studentCount = 27;
		int divColorpen = colorPen / studentCount;		
		int remainColorPen = colorPen % studentCount;
		
		System.out.println("Number of crayons shared per student :"+divColorpen);
		System.out.println("Remaining crayons :"+remainColorPen);
	}
}