package p581;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		
//			익명 객체			
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i=0; i<5; i++) {
//					toolkit.beep();
//					try { Thread.sleep(500); } catch(Exception e) {}
//					}
//				}
//		});
			
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		for(int i=0; i<5; i++) {
//			toolkit.beep();
//			try { Thread.sleep(500); } catch(Exception e) {}
//		}
		
		// 람다식
		Thread thread = new Thread(() -> {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i=0; i<5; i++) {
		toolkit.beep();
		try { Thread.sleep(500); } catch(Exception e) {}
		}		
		});
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
