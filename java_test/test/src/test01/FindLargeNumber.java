package test01;

import java.util.Scanner;

public class FindLargeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("세 정수의 최대값을 구하시오");
		System.out.println("a의 값");
		int a = sc.nextInt();
		System.out.println("b의 값");
		int b = sc.nextInt();
		System.out.println("c의 값");
		int c = sc.nextInt();
		
		int max = a;
		if (b>max) max=b;
		if (c>max) max=c;
		System.out.println("최대값: " + max);
		
	}
}
		