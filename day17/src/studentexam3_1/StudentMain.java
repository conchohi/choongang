package studentexam3_1;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동");
		Subject[] subjects = {
				new Subject("국어", 90),
				new Subject("영어", 80),
				new Subject("수학", 85),
				new Subject("과학", 100)
		};
		
		ArrayList<Subject> subjects1 = new ArrayList<>(Arrays.asList(subjects));

//		subjects1.add(new Subject("국어", 90));
//		subjects1.add(new Subject("영어", 80));
//		subjects1.add(new Subject("수학", 85));
//		subjects1.add(new Subject("과학", 100));
		
		student1.addSubject(subjects1);
		
		student1.printSubject();
		student1.printScore();
	}

}
