package test01;

import java.util.Scanner;

public class JungsuSign {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수의 값을 입력하세요.");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("양수 입니다.");
		} else if (a==0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수 입니다.");
		}
	}
}
