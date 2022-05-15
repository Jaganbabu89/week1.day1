package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 001503;
	boolean isPunctured = false;
	String bikeName = "Dominar";
	double runningKM = 18156.4;

	public static void main(String[] args) {
		
		TwoWheeler twoWheel = new TwoWheeler();
		
		System.out.println("Number of Wheels = "+twoWheel.noOfWheels);
		System.out.println("Number of Mirrors = "+twoWheel.noOfMirrors);
		System.out.println("Chassis Number = "+twoWheel.chassisNumber);
		System.out.println("Is Punctured = "+twoWheel.isPunctured);
		System.out.println("Bike Name = "+twoWheel.bikeName);
		System.out.println("Kilometers driven = "+twoWheel.runningKM);

	}

}
