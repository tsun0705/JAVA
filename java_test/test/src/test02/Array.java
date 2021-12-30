package test02;

public class Array {

	public static void main(String[] args) {
		int[] arr= new int[5];
		for(int i=1; i<(arr.length)+1; i++) {
			arr[i-1] += i;
			System.out.println(arr[i-1]);
		}
	}

}
