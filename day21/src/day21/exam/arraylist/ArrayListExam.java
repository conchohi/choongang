package day21.exam.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		//List는 인터페이스라 객체 생성 불가
		//ArrayList가 List를 구현하기 때문에 가능
		List<String> list = new ArrayList<>();
		
		list.add("java");
//		list.add(85); //컴파일 에러, 정수값이므로 List<Integer> list = new ArrayList<Integer>();
		list.add("홍길동");
		list.add("김자바");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		list.add(2,"이강산");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		list.remove(0);
		

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		list.clear();

		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
