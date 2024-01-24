package polymorphism.vehicle;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
//		if(vehicle instanceof Bus) {
//			Bus bus = (Bus)vehicle;
//			bus.show();
//		}
		if(vehicle instanceof Bus bus) {
			bus.show();
		}
	}
}
