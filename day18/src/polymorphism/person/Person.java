package polymorphism.person;

public class Person {
	private String name;
	private int age;
	private String address;
	
	private Person() {}
	
	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "name : " + name + "\nage : " + age + "\naddress : " + address ;
	}

	public static class PersonBuilder{
		private Person person = new Person();
		
		public PersonBuilder withName(String name) {
			person.name = name;
			return this;
		}
		
		public PersonBuilder withAge(int age) {
			person.age = age;
			return this;
		}
		
		public PersonBuilder withAddress(String address) {
			person.address = address;
			return this;
		}
		
		public Person build() {
			return person;
		}
		
	}

}
