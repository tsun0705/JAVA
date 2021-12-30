package test02;

public class Prime {

	public static void main(String[] args) {
		for(int i=2; i<=1000; i++) {
			int n;
			for(n=2; n<i; n++) {
				if(i%n==0)
					break;
			}
			if(n==i)
				System.out.print(n + " ");
		}
		System.out.println();
	}

}
