package lesson19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdresssEx {
	public static void main(String[] args) throws Exception {
		InetAddress ip = InetAddress.getByName("blog.naver.com");
		System.out.println("호스트명 : "  + ip.getHostName());
		System.out.println("ip : "  + ip.getHostAddress());
	
		//ip 전체
		InetAddress[] ips = InetAddress.getAllByName("blog.naver.com");
		
		for(InetAddress i : ips) {
			System.out.println("ip 주소 :" + i);
		}
		
		byte[] ipAddr = ip.getAddress();
		for(byte b : ipAddr) {
			System.out.print((b < 0 ? b + 256 : b) + ".");
		}
		System.out.println();
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("네 컴퓨터 ip" + local);
		
		InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
		System.out.println(ips[0].getHostAddress() + "주소 : " + ip2);
		
		System.out.println(InetAddress.getByName("blog.naver.com"));
	}
}
