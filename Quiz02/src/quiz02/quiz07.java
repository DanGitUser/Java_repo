package quiz02;
//3. input month and output season
// 예시 3~5 = 봄
import java.util.Scanner;

public class quiz07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Month of Year (1~12): ");
		
		int month = scan.nextInt();        
        switch (month) {
            case 12: // December
            case 1:  // January
            case 2:  // February
                System.out.println("Winter");
                break;
            case 3:  // March
            case 4:  // April
            case 5:  // May
            	System.out.println("Spring");
                break;
            case 6:  // June
            case 7:  // July
            case 8:  // August
            	System.out.println("Summer");
                break;
            case 9:  // September
            case 10: // October
            case 11: // November
            	System.out.println("Fall");
                break;
            default:
            	System.out.println("Invalid month number. (1 ~ 12 ONLY)");
                break;
        }
	}
}