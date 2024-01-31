package exam.vehicle;

public class Bus extends Vehicle {
	int passenger;
	String region;
	
	public Bus(String name, int count, int passenger, String region) {
		super(name, count);
		this.passenger = passenger;
		this.region = region;
	}
	
	public static class BusBuilder {
		String name;
		int count;
		int passenger;
		String region;
		
		public BusBuilder(String name, int count) {
			this.name = name;
			this.count = count;
		}
		
		public BusBuilder withPassenger(int passenger) {
			this.passenger = passenger;
			return this;
		}
		
		public BusBuilder withRegion(String region) {
			this.region = region;
			return this;
		}
		
		public Bus build() {
			return new Bus(name, count, passenger, region);
		}
		
		
		
	}
	
	public void run() {
		System.out.println(name + "가 승객 " + passenger + "명을 태우고 달립니다.");
		System.out.println(name + "는 " + region + "지역만 " + count + "대가 운행 중입니다.");
	}

}
