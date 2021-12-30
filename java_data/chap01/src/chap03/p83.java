package chap03;

public class p83 {

	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		try {
			//int z = x/y;
			int z = x % y;
			System.out.println("z: " + z);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		}
	}

}
