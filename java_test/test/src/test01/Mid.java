package test01;

import java.util.Scanner;

public class Mid {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("세 정수의 중간값을 구하시오");
		System.out.println("a의 값");
		int a = sc.nextInt();
		System.out.println("b의 값");
		int b = sc.nextInt();
		System.out.println("c의 값");
		int c = sc.nextInt();
		
		int mid = 0;
		if ((a > b && a < c) || (a < b && a > c)) System.out.println("중간값: " + a);
		else if ((b > a && b < c) || (b < a && b > c)) System.out.println("중간값: " + b);
		else if ((c > b && c < a) || (c > a && c < b)) System.out.println("중간값: " + c);
		else System.out.println("잘못 입력했습니다.");
	}
}
