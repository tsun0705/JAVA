package p1056;

import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class InetAddressExample {

	public static void main(String[] args) throws UnknownHostException, Exception {
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내컴퓨터 IP주소: " + local.getHostAddress());
		
		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		for(InetAddress remote : iaArr) {
			System.out.println("www.naver.com IP주소: " + remote.getHostAddress());
		}
	}
}
