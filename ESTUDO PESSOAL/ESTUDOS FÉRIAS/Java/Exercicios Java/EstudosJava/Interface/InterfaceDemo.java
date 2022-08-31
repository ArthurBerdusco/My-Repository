
public class InterfaceDemo {

	public static void main(String[] args) {
		MountainBike mountainBike = new MountainBike(20,10,1);
		
		System.out.println("Gear is: " + mountainBike.getGear());
		System.out.println("Seat height is: " + mountainBike.getHeight());
		System.out.println("Bike spped is: " + mountainBike.getSpeed());

		mountainBike.applyBrake(1);
		System.out.println("Bike speed after applying break is: " + mountainBike.getSpeed());
	}
}
