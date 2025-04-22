package lesson12;
//Protocol ://Domain/FileName?QueryString(parameter)

import java.util.Arrays;

//1. Cut down the url into the parts listed above.

//QuesryString Key1 = value1 & key2=value2 &

public class Ex250421 {
	public static void main(String[] args) {
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=u5kh9aje";
		MyUrl myUrl = new MyUrl(url);
//		System.out.println(myUrl);
	}
}

class MyUrl {
	String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=u5kh9aje";
	String protocol;
	String domain;
	String fileName;
	String queryString;
	Param[] params;

	public MyUrl(String url) {

		protocol = url.substring(0, url.indexOf("://"));
		url = url.substring(url.indexOf("://") + "://".length());

		domain = url.substring(0, url.indexOf("/"));
		url = url.substring(url.indexOf("/") + "/".length());

		fileName = url.substring(0, url.indexOf("?"));
		url = url.substring(url.indexOf("?") + "?".length());
		
		System.out.println("Protocol -> " + protocol + "://");
		System.out.println("Domain -> " + domain);
		System.out.println("File Name -> " + fileName);
		System.out.println("Query String Parameter -> ");
		
		queryString = url;
		String[] tmps = queryString.split("&");
		params = new Param[tmps.length];
		for (int i = 0; i < tmps.length; i++) {
			String[] t = tmps[i].split("=");
			params[i] = new Param(t[0], t[1]);
			System.out.println("> " + t[0] + " = " + t[1]);
		}

	}


	
	@Override
	public String toString() {
		return String.format("MyUrl [url=%s, protocol=%s, domain=%s, fileName=%s, queryString=%s, params=%s]", url,
				protocol, domain, fileName, queryString, Arrays.toString(params));
	}



	class Param {
		String key;
		String value;
		
		public Param(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString() {
			return String.format("Param [key=%s, value=%s]", key, value);
		}		
	}
}
