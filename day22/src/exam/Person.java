package exam;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	private Person(PersonBuilder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.height = builder.height;
		this.weight = builder.weight;
	}
	
	public static class PersonBuilder {
		private String name;
		private int age;
		private double height;
		private double weight;
		
		public PersonBuilder withName(String name) {
			this.name = name;
			return this;
		}
		
		public PersonBuilder withAge(int age) {
			this.age = age;
			return this;
		}
		
		public PersonBuilder withHeight(double height) {
			this.height = height;
			return this;
		}
		public PersonBuilder withWeight(double weight) {
			this.weight = weight;
			return this;
		}
		
		public Person build() {
			return new Person(this);
		}
	}

	@Override
	public String toString() {
		return "name = " + name + ", age = " + age + ", height = " + height + ", weight = " + weight;
	}
	
	

}
