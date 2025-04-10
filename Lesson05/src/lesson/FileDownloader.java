package lesson;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FileDownloader {
	public static void main(String[] args) throws Exception {
		String img = "https://ap-cdn.sfo3.cdn.digitaloceanspaces.com/uploads/2025/01/spinning-cat-origen-meme-gato-oiia.jpg";
		URL url = new URL(img);
		
		InputStream is = url.openStream();
		FileOutputStream fos = new FileOutputStream("cat.jpg");
		
		int b = 0;
		while( (b = is.read()) != -1) {
			fos.write(b);
		}
		fos.close();
	}
}
