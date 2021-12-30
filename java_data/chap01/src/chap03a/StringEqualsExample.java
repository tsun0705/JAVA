package chap03a;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "권하늘";
		String strVar2 = "권하늘";
		String strVar3 = new String("권하늘");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);  // 주소에 의한 비교
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3)); // 내용에 의한 비교
		
	}

}
