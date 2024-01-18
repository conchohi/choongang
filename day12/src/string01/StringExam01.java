package string01;

public class StringExam01 {

	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = "홍길동";
		String str3 = "홍길동";
		String str4 = new String("홍길동");
		
		
		System.out.println(str1 == str2); //false
		System.out.println(str2 == str3); //true
		System.out.println(str1 == str4); //false
		System.out.println(str1.equals("홍길동")); //true
		System.out.println(str2.equals("김자바")); //false
		System.out.println(str1.endsWith(str2)); //true
		
		str2 += "님 즐거운 시간입니다."; //기존 객체를 버리고 새로운 객체를 생성한 다음 주소 저장
		
		String str5 = "Hello java!!";
		
		System.out.println(str2.length()); //스페이스바도 문자열 길이 포함
		System.out.println(str5.charAt(2)); //'l'
		System.out.println(str5.indexOf('j')); //6
		System.out.println(str5.indexOf('l')); //2
		System.out.println(str5.indexOf("java")); //6
//		String str = String.valueOf(10); //"10
		str5.replace("llo", "*");
		System.out.println(str5);
		str5.concat(str5);
		System.out.println(str5);
		str5.toUpperCase();
		System.out.println(str5);
		
		String str = "abc/def-21/a";
		String[] splitStr = str.split("/|-| ");
		for(String s : splitStr) {
			System.out.println(s);
		}
	}

}
