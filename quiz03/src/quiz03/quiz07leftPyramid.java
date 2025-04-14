package quiz03;

public class quiz07leftPyramid {
	public static void main(String[] args) {
		
		int range = 5;
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {
            	if(i + j >= 4) {
            		System.out.printf("*", i, j);
            	}
            	else {
            		System.out.printf("%c", ' ');
            	}
            }
            System.out.println();
        }
    }
}