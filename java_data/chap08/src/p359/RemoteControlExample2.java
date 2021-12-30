package p359;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {		
			public void turnOn() {System.out.println("전원온");}
			public void turnOff() {System.out.println("전원오프");}
			public void setVolume(int volume) {System.out.println("볼륨설정");}
		};
	}
}
