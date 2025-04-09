package lesson;

public class lesson05_5 {
	public static void main(String[] args) {
		//Date calculation
		//0 : sunday, 6 : saturday
		int day = 5;
		switch(day) {
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		default:
			System.out.println("You stupid or something?");
		}
	}
}
