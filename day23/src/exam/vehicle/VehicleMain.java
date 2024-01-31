package exam.vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle[] vehicles = {
				new Car.CarBuilder("소나타", 3)
				.withSpeed(90)
				.withColor("노랑색")
				.withModel("hybrid")
				.build(),				
				new Bus.BusBuilder("360번 버스", 4)
				.withPassenger(10)
				.withRegion("서울")
				.build()
		};
		
		for (Vehicle vehicle : vehicles) {
			vehicle.info();
			vehicle.drive();
			
			if(vehicle instanceof Bus bus) {
				bus.run();
			}
			
			System.out.println();
		}
	}

}
