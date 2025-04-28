package lesson18;

import java.io.FileInputStream;
import java.util.Arrays;

public class inputStreamEx {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("file.txt");
//		for (int i = 0; i < 24; i++) {
//			int b = fis.read();
//			System.out.println(b + " :: " + (char)b);
//		}
//		System.out.println(fis.read()); 
//		//-1 means there is nothing to read.
//		int b = 0;
//		while((b = fis.read()) != -1) {
//			System.out.println(b + " :: " + (char)b);
//		}
//		byte[] bs = new byte[50];
//		int ret1 = fis.read(bs, 5, 10);
//		System.out.println(Arrays.toString(bs));
//		System.out.println(ret1);
//		ret = fis.read(bs);
//		System.out.println(Arrays.toString(bs));
//		System.out.println(ret);
//		for (int i = 0; i < 6; i++) {
//			int ret = fis.read(bs);
//			System.out.println(Arrays.toString(bs));
//			System.out.println(ret);
//		}
		
		byte[] bs = fis.readAllBytes();
		System.out.println(Arrays.toString(bs));
		
		fis.close();
	}
}
