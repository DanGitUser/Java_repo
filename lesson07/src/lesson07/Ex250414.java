package lesson07;

public class Ex250414 {
	public static void main(String[] args) {

		char[][] chs = {
				{' ',' ','*',' ',' '},	
				{' ','*',' ','*',' '},	
				{'*',' ','*',' ','*'},	
				{' ','*',' ','*',' '},	
				{'*',' ','*',' ','*'},	
		};

		char[][] result = new char[5][5];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < chs[i].length; j++) {
				System.out.print(chs[i][j] + " ");
				result[j][5 - 1 - i] = chs[i][j];
			}
			System.out.println();
			
		}
		for (char[] t : result) {
			for (char n : t) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
