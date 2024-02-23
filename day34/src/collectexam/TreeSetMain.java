package collectexam;

import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		TreeSet<Person> personTree = new TreeSet<>();
		
		personTree.add(new Person("홍길동",20));
		personTree.add(new Person("김자바",15));
		personTree.add(new Person("이강산",32));
		personTree.add(new Person("한바다",27));
		
		for (Person person : personTree) {
			System.out.println(person);
		}
	}

}

