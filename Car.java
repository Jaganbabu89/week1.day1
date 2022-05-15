package week1.day1;

public class Car {
	
	public void applyBreak() {
		System.out.println("Appying Break");
	}
	
	public void applyGear() {
		System.out.println("Changing Gear");
	}
	
	public void switchonAc () {
		System.out.println("AC is ON");
	}
	
	public void applyAcclerate() {
		System.out.println("Accelerating");
	}

	public static void main(String[] args) {
		
		Car vehicle = new Car();
		
		vehicle.applyBreak();
		vehicle.applyGear();
		vehicle.switchonAc();
		vehicle.applyAcclerate();

	}

}
