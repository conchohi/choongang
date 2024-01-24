package polymorphism.vehicle;

public class DriverExam {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		bus.name = "마을 버스";
		bus.color = "노랑";
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
