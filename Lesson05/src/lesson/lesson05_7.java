package lesson;

import java.util.Scanner;

public class lesson05_7 {
	public static void main(String[] args) {
		
		int rock = 1;
		int paper = 2;
		int scissor = 3;
		System.out.print("rock("+rock+"), paper("+paper+"), scissor(" +scissor+") :");
		Scanner scan = new Scanner(System.in);
		int me = scan.nextInt();
		String[] values = {"가위" ,"바위", "보"};
		//Greater than 0, Lesser than (1/3/4)
		int com = (int)(Math.random() * 3 + 1);
		System.out.println("내가 낸 것 : "+ values[me-1] + ", 컴퓨터가 낸 것 : "+ values[com-1]);
		
		int result = (me - com);
		switch (result) {
		case 0 :
			System.out.println("DRAW");
			break;
		case 1: case -2:
			System.out.println("User Win");
			break;
		case -1: case 2:
			System.out.println("PC Win");
			break;
		}
	}
}

//String[] values = {"가위" ,"바위", "보"};
//System.out.println("내가 낸 것 : "+ values[me-1] + ", 컴퓨터가 낸 것 : "+ values[com-1]);