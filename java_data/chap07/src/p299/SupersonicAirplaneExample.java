package p299;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplalne sa = new SupersonicAirplalne();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplalne.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplalne.NORMAL;
		sa.fly();
		sa.land();
	}
}
