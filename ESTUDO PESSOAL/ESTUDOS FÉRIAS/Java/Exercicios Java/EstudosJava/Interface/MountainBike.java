
public class MountainBike implements Bicycle{

	private int seatHeight;
	private int gear;
	private int speed;
	
	public MountainBike(int startHeight, int startSpeed, int startGear) {
		seatHeight = startHeight;
		speed = startSpeed;
		gear = startGear;
	}
	
	public int getHeight() {
		return seatHeight;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getGear() {
		return gear;
	}
	
	
	public void setHeight(int height) {
		this.seatHeight = height;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	
	@Override
	public void applyBrake(int decrement) {
		System.out.println("Freiando...");
		this.speed -= decrement; 
	}

	@Override
	public void speedUp(int increment) {
		this.speed += increment;
	}

}
