


public class Inheritance {
	
	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike(20,10,1);
		System.out.println("Gear is: " + mountainBike.getGear());
		System.out.println("Seat height is: " + mountainBike.seatHeight);
		System.out.println("Bike speed is: " + mountainBike.speed);
		mountainBike.applyBrake(1);
		System.out.println("Bike speed after applying break is: " + mountainBike.speed);
		mountainBike.setGear(5);
		System.out.println("Bike gear after change the gear is: " + mountainBike.getGear());
		
		
		Bicycle bike1 = new Bicycle(10,20);
		bike1.setGear(10);
		System.out.println(bike1.getGear());
		
	}
	
	

}
