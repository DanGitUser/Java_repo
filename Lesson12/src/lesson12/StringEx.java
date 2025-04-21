package lesson12;

import java.io.File;

public class StringEx {
	public static void main(String[] args) {
		String str = "1234abcd1234abcd";
		System.out.println(str.length());
		
		//indexOf
		System.out.println(str.indexOf("d12"));
		System.out.println(str.indexOf("d2"));
		System.out.println(str.indexOf("d", 4));
		System.out.println(str.indexOf("d", 4, 10));
		
		//lastIndexOf
		System.out.println(str.lastIndexOf("d"));
		System.out.println(str.lastIndexOf("d", 4));
		System.out.println(str.lastIndexOf("c", 4));
		
		//substring
		System.out.println(str.substring(4));
		System.out.println(str.substring(4, 10));
		System.out.println(str.substring(str.indexOf("c"), str.lastIndexOf("c")));
		
		System.out.println(str.toUpperCase());
		
		String[] fileNames = {"abcd.txt", "1234.txt", "abcd.exe", "abcd.bin"};

		for (int i = 0; i < fileNames.length; i++) {
			if(fileNames[i].endsWith(".txt"))
			System.out.println(fileNames[i]);
		}
		for (int i = 0; i < fileNames.length; i++) {
			if(fileNames[i].startsWith("abcd"))
				System.out.println(fileNames[i]);
		}
		File dir = new File("C:\\Users\\TJ\\dan-workspace");
		System.out.println(dir.isFile());
		System.out.println(dir.isDirectory());
	}
}
