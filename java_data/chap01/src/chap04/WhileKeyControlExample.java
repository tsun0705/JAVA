package chap04;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("--------------------");
				System.out.println("X.증속 | C.감속 | Q.중지");
				System.out.println("--------------------");
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read();
			
			if (keyCode == 88 || keyCode == 120) {
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 67 || keyCode == 99) {
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if (keyCode == 81 || keyCode == 113) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
