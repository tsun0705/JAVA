package test02;

import java.util.Scanner;

public class ArrayReverse {
	static void reverse(int [] a) {
		for(int i=a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 개수");
		int num = sc.nextInt();
		int[] x = new int[num];
		for(int i=0; i<num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		reverse(x);
	}

}
