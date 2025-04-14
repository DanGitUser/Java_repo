package lesson02;

import java.util.Arrays;

public class ArrEx10_2 {
	public static void main(String[] args) {
		//first
		int[][] matrix = new int[3][3];
	  //int[][] matrix = new int[4][3];
      //int[][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}, {0, 0, 0}};
		
	
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		//second
		int[][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		//third
		int[][] matrix3 = {
				{1,2,3}, 
				{4,5,6}, 
				{7,8,9}
		};
		
		System.out.println("First");
		int count = 1;
		for (int i  = 0; i<matrix.length; i++) {
			for (int j = 0; j<matrix.length; j++) {
				matrix[i][j] = count++;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Second");
		for (int i  = 0; i<matrix2.length; i++) {
			for (int j = 0; j<matrix2.length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Third");
		for (int i  = 0; i<matrix3.length; i++) {
			for (int j = 0; j<matrix3.length; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(matrix2));
		System.out.println(Arrays.toString(matrix2));
	}
}
