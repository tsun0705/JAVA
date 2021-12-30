package chap04;

public class ifExample {

	public static void main(String[] args) {
		int score = 93;
		
		if (score>=90) {
			System.out.println("점수가 90이상입니다.");
			System.out.println("등급은 A입니다.");
		}
		else {
			System.out.println("점수가 90미만 입니다.");
			System.out.println("점수는 B등급 입니다.");
		}
	}
}
