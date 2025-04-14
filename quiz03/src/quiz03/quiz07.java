package quiz03;

public class quiz07 {
	public static void main(String[] args) {
		
		int range = 10;
		int height = 10;
		int base = 9;
        for (int i = -base; i < height; i++) {
            for (int j = -base; j < range; j++) {
            	if(i * j < base && i * j > -base) {
            		System.out.printf("%2d,%2d", i, j);
            	}
            	else {
            		System.out.printf("%5c", ' ');
            	}
            }
            System.out.println();
        }
    }
}