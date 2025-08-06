package parking_lot_system;

public class Car extends Vehicle{

	public Car(String number) {
		super("car", number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCharge() {
		// TODO Auto-generated method stub
		return 100;
	}

}
