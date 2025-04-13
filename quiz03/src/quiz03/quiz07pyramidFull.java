package quiz03;

public class quiz07pyramidFull {
	public static void main(String[] args) {
        int height = 5;
//for (int i = height; i > 0; i--)
        for (int i = 1; i <= height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}