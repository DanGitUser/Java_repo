package quiz03;

public class quiz07rightPyramid {
	public static void main(String[] args) {
        int height = 5;

        for (int i = height; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
