package MyWeek;

import java.util.Scanner;

public class money2 {

	public static void main(String[] args) {
		int cnt[] = {10000, 5000, 1000, 500, 100, 50, 1};
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나누는 금액을 입력 :");
		int money = scanner.nextInt();
		
		for (int i : cnt) {
			int j = money/i;
			money %= i;
			System.out.println(i + "원 : " + j + "개" );
		}
	}

}
