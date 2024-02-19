package listexam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExam02 {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(3); //arrayList.add(new Integer(3)); 자동 박싱
		arrayList.add(20);
		
		for (int num : arrayList) {
			System.out.println(num);
		}
		
		ArrayList<Student> std = new ArrayList<>();
		
		std.add(new Student("홍길동", 20));
		std.add(new Student("김자바", 25));
		std.add(new Student("이강산", 28));
		
		//showInfo
		System.out.println("------------------");
		//for 반복문
		for (int i = 0; i < std.size(); i++) {
			std.get(i).showInfo();
		}
		
		System.out.println("------------------");
		//향상된 for문
		for (Student student : std) {
			student.showInfo();
		}
		
		System.out.println("------------------");
		//iterator 반복자 이용
		Iterator<Student> iter = std.iterator();
		while(iter.hasNext()) {
			iter.next().showInfo();
		}
		System.out.println("------------------");
	}

}
