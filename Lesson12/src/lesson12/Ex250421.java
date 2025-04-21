package lesson12;

import java.util.Arrays;

public class Ex250421 {
	public static void main(String[] args) {
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=u5kh9aje";
		System.out.println(url.length());
		//Protocol ://Domain/FileName?QueryString(parameter)
		//1. Cut down the url into the parts listed above.
		
		//QuesryString Key1 = value1 & key2=value2 &
		
//		System.out.println(url.substring(url.indexOf("h"), url.lastIndexOf("://")));
		String urlArry[] = url.split("://");
		System.out.println(Arrays.toString(urlArry));
		
		String urlLine = String.join("", url);
		System.out.println(urlLine);
		System.out.print("");
		for (int i = 0; i < urlArry.length; i++) {
			System.out.println(urlArry[i] + "");
		}
//		System.out.println("Protocol > " + url.substring(url.indexOf("h"), url.lastIndexOf("://")) + "://");
//		System.out.println("Domain > " + url.substring(url.indexOf("/"), url.lastIndexOf(".com")) + ".com");
//		System.out.println("File Name > " + url.substring(url.indexOf("/"), url.lastIndexOf("?")));
		
	}
}
