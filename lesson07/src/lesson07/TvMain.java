package lesson07;

import java.util.Scanner;

public class TvMain {
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		System.out.println("Im a Remote!");
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		while(true) {
			System.out.println("The TV is :" + (tv.power ? "On" : "Off"));
			System.out.println("Channel :"  + tv.channel + ", Volume :" + tv.volume);
			
			System.out.println("Menu Selection");
			System.out.println(
					"1. Power On/Off\n2. Channel Up 3. Channel Down\n4. Volume Up 5. Volume Down"
					);
			int input = scanner.nextInt();
			switch (input) {
			case 1:
				tv.doPower();
				break;
			case 2:
				tv.channelUp();
				break;
			case 3:
				tv.channelDown();
				break;
			case 4:
				tv.volumeUp();
				break;
			case 5:
				tv.volumeDown();
				break;
			case 6:
				running = false;
				break;
			default :
				System.out.println("Invalid Input");
			}
		}
	}
}
