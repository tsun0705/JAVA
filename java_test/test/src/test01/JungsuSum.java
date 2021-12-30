package test01;

import java.util.Scanner;

public class JungsuSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수의 값을 입력하세요.");
		int a = sc.nextInt();
		int sum=0;
		for(int i=a; i>=0; i--) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
