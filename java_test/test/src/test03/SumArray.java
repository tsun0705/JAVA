package test03;

public class SumArray {

	public static void main(String[] args) {
		double[] x = {1.0,2.0,3.0,4.0,5.0};
		double sum =0;
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}

}
