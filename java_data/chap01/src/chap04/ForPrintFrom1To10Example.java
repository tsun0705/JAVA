package chap04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		int i=2, j=1, k=1;
		for(k=0;k<2;k++) {
			for(j=1; j<=9 ; j++) {
				for(i=2+(k*4); i<=5+(k*4); i++) {
				    System.out.printf("%2d x %2d = %2d  ",i,j,i*j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}