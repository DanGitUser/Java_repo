package lesson;

public class NestFor {
	public static void main(String[] args) {
		// 2types of for lines
		//multiplication table
		//*
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5; j++) {
				if (i <= j) {
				System.out.printf("ඞ");
				}
			}
			System.out.println();
		}
	}
}
