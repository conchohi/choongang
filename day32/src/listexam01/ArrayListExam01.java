package listexam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExam01 {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>(); //다형성, 업캐스팅
//		ArrayList<String> arrayList = new ArrayList<>();
//		String[] arrStr = new String[5];
		
		//자료를 추가 add(데이터);, 가장 마지막에 추가
		arrayList.add("홍길동");
//		arrayList.add(3); //문자열 리스트에 정수형 삽입 불가
		arrayList.add("김자바");
		arrayList.add("이강산");
		arrayList.add("한바다");
		
		int size = arrayList.size(); //arrStr.length
		System.out.println("자료의 크기 : " + size);
		
		//자료의 내용을 출력 get(int index);
		for(int i = 0; i < size; i++) {
			System.out.println(arrayList.get(i)); //배열 - arrStr[i]
		}
		System.out.println("-----------------------");
		for (String str : arrayList) { //향상된 for문
			System.out.println(str);
		}
		System.out.println();
		
		arrayList.add(1,"수박");
		System.out.println("자료의 크기 : " + arrayList.size());
		
		System.out.println("-----------------------");
		for (String str : arrayList) { //향상된 for문
			System.out.println(str);
		}
		System.out.println();
		
		arrayList.clear();
		System.out.println("자료의 크기 : " + arrayList.size());
		
		arrayList.add("홍길동");
		arrayList.add("김자바");
		arrayList.add("이강산");
		arrayList.add("한바다");
		
		//iterator() 메소드 - 반복자
		//hasNext() : 다음 원소 존재 여부, 있으면 true 없으면 false
		//next() : 다음 원소 반환
		Iterator<String> iter = arrayList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//자료를 삭제, 특정 위치의 자료를 삭제
		//remove : 하나 삭제
		//removeAll 
		//clear : 전체 삭제
		
	}

}
