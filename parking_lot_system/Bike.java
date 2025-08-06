package parking_lot_system;

public class Bike extends Vehicle{

	public Bike( String number) {
		super("bike", number);
		
	}

	@Override
	public int getCharge() {
		// TODO Auto-generated method stub
		return 50;
	}

}
