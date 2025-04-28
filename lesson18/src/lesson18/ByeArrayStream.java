package lesson18;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByeArrayStream {
	public static void main(String[] args) throws Exception{
		//byte[] create
		//array to file
		//read file
		//print to array[]
		
		byte[] arr = {65,66,67,68,69};
		ByteArrayInputStream bias = new ByteArrayInputStream(arr);
		FileOutputStream fos = new FileOutputStream("output4.txt");
		fos.write(bias.readAllBytes());
		fos.close();
		
		FileInputStream fis = new FileInputStream("output4.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(fis.readAllBytes());
		System.out.println(baos);
		fis.close();
	}
}
