package test02;

import java.util.Scanner;

public class ArrayInt {
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++)
			if(a[i] > max)
				max = a[i];
			return max;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("사람의 수");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("height[" + (i+1) + "] : ");
			height[i] = stdIn.nextInt();
		}
		System.out.println("최대값: " + maxOf(height));
	}

}
