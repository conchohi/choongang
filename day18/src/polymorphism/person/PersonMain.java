package polymorphism.person;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person.PersonBuilder()
				.withName("홍길동")
				.withAge(25)
				.withAddress("강남역")
				.build();
		
		System.out.println(person);
	}

}
