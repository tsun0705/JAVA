package test02;

import java.util.Scanner;

public class Sosu {

	public static void main(String[] args) {
		System.out.println("1000이하의 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		double b = a; 
		System.out.println("소수 계산: " + b);
	}

}
