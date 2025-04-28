package lesson18;

import java.io.FileOutputStream;

public class LetterGenEx {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("String.txt");
		for (int i = 'A' ; i <= 'Z'; i++) {
			fos.write(i);
			System.out.write(i);
		}
		fos.write('\n');
		for (int i = 'a' ; i <= 'z'; i++) {
			fos.write(i);
			System.out.write(i);
		}
		fos.write('\n');
		for (int i = '0' ; i <= '9'; i++) {
			fos.write(i);
			System.out.write(i);
		}
		fos.write('\n');
		fos.close();
	}
}
