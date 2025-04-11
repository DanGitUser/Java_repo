package lesson;

public class b369 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			int count = 0; // number of claps
			int tmp = i;
			
			// number of clap per
			do {
				if(tmp % 10 % 3 == 0 && tmp % 10 != 0) {
					count++;
				}
			}while((tmp /= 10) != 0);
			
			if(count > 0) {
				for (int j = 0; j < count ; j++) {
					System.out.print("Clap ");
				}
				System.out.println();
			}
			else {
				System.out.println(i);
			}
		}
	}
}
