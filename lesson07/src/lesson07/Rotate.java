package lesson07;

public class Rotate {
	public static void main(String[] args) {
		int[][] val = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int[][] result = new int[3][3];
		
		result[0][2] = val[0][0];
		result[1][2] = val[0][1];
		result[2][2] = val[0][2];
		
		result[0][1] = val[1][0];
		result[1][1] = val[1][1];
		result[2][1] = val[1][2];
		
		result[0][0] = val[2][0];
		result[1][0] = val[2][1];
		result[2][0] = val[2][2];
		
		for (int i = 0; i < val.length; i++) {
			for (int j = 0; j < val[i].length; j++) {
				System.out.print(val[i][j] + " ");
				result[j][3 - 1 - i] = val [i][j];
			}
			System.out.println();
		}
		for (int[] t : result) {
			for (int n : t) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
	}
}
