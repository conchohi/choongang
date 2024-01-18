package type;

public class TypeExam02 {

	public static void main(String[] args) {
//		char cValue = '';에러 //비교 String sValue = "";가능
		char cValue = ' '; //스페이스 = 유니코드 32, 반드시 '' 사이 공백
		
		char a = 65;
		char a1 = 'A';
		cValue = 'A' + 1; //가능 -> 문자 + 1
//		char b = a1 + 1; //에러 -> 정수(65) + 1
//		int b = a1 + 1; 
		
		
		System.out.println(a);
		System.out.println(a1);
		System.out.println(cValue);
		
	}

}
