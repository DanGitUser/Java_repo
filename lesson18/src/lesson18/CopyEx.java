package lesson18;

import java.io.FileOutputStream;

import java.io.FileInputStream;

public class CopyEx {
	public static void main(String[] args) throws Exception {
		//copy String to String 2
		FileInputStream fis = new FileInputStream("String.txt");
		FileOutputStream fos = new FileOutputStream("String2.txt");
//		FileInputStream fis = new FileInputStream("String.txt");
//		FileOutputStream fos = new FileOutputStream("String2.txt");
//		byte[] bs = new byte[65];
//		for (int i = 0; i < 10; i++) {
//			int ret = fis.read(bs);
//		}
//		fos.write(bs);
		
//		int b = 0;
//		while ((b = fis.read()) != -1) {
//			fos.write(b);
//		}
		byte[] bs = new byte[1];
		int length = 0;
		while((length = fis.read(bs)) != -1) {
			fos.write(bs, 0, length);
		}
		
		fis.close();
		fos.close();
	}
}
