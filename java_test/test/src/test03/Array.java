package test03;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[][] x = new int[2][4];
		x[0][1] = 37;
		x[0][3] = 54;
		x[1][2] = 65;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		x[0][0] = sc.nextInt();
		System.out.println("정수를 입력해주세요");
		x[0][2] = sc.nextInt();
		System.out.println("정수를 입력해주세요");
		x[1][0] = sc.nextInt();
		System.out.println("정수를 입력해주세요");
		x[1][1] = sc.nextInt();
		System.out.println("정수를 입력해주세요");
		x[1][3] = sc.nextInt();
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
			System.out.println("x[" + i + "][" + j + "]=" + x[i][j]);
			}
		}
	}
}
