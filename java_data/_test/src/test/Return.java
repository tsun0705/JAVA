package test;

public class Return {
	  public static void main(String[] args) {
	        Return r = new Return();
	        r.check(6);
	    }

    public void check(int i) {
        if (i % 3 == 0) {
            System.out.println(i + "는 3의 배수이다.");
            return;
        }
        System.out.println(i + "는 3의 배수가 아니다.");
    }

  
}