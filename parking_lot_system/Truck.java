package parking_lot_system;

public class Truck extends Vehicle{

	public Truck( String number) {
		super("truck", number);
		
	}

	@Override
	public int getCharge() {
		
		return 200;
	}

}
