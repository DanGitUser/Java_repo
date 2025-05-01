package lesson19;

import java.net.URL;

public class UrlEx {
	public static void main(String[] args) throws Exception {
		String addr = "https://search.naver.com:443/search.naver?ssc=tab.image.all&where=image&sm=tab_jum&query=cat#imgId=image_sas%3Aweb_eca1dfeb164328e720dfb1199513b098";
		URL url = new URL(addr);
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getPath());
		System.out.println(url.getFile());
		System.out.println(url.getQuery());
		System.out.println(url.getRef());
	}
}
