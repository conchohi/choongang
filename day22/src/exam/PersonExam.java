package exam;

public class PersonExam {

	public static void main(String[] args) {
		Person person = new Person.PersonBuilder()
				.withName("홍길동")
				.withAge(30)
				.withHeight(173.3)
				.withWeight(56.6)
				.build();
		
		System.out.println(person);
	}

}
