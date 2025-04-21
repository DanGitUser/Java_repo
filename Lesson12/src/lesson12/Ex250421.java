package lesson12;
//Protocol ://Domain/FileName?QueryString(parameter)

//1. Cut down the url into the parts listed above.

//QuesryString Key1 = value1 & key2=value2 &

public class Ex250421 {
	public static void main(String[] args) {
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=u5kh9aje";

		String urlArry[] = url.split("://");
		String http = urlArry[0];
		String restOf = urlArry[1];

		String domain[] = restOf.split("/");
		String com = domain[0];
		String restOf2 = domain[1];

		String fileName[] = restOf2.split("\\?");
		String file = fileName[0];
		String restOf4 = fileName.length > 1 ? fileName[1] : "";

		System.out.println("Protocol -> " + http + "://");
		System.out.println("Domain -> " + com);
		System.out.println("File Name -> " + file);
		System.out.println("Query String Parameter -> ");

		String[] queryKey = restOf4.split("&");
		for (int i = 0; i < queryKey.length; i++) {
			String[] queryValue = queryKey[i].split("=");
			System.out.println("> " + queryValue[0] + " = " + queryValue[1]);
		}
	}
}
