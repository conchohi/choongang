package method;

public class CharExam {
	private static final int KEY_VALUE = 5; //상수, 선언한 곳에서만 값을 변경 가능
										//코딩 중 다른 부분의 코드에서는 변경 불가
	public static void main(String[] args) {
		//문자를 이용해서 비밀번호를 암호화 시키고
		//다시 복호화 시키는 문제
//		String name ="홍길동";
		String password = "ghdrlfehd";
		String encryptedPassword = "";
		String decodingPassword = "";
		//정수 연산자(+,-,*,/) 정수 -> 정수
		//정수 연산자(+,-,*,/) 실수 -> 실수
		//문자 연산자(+,-,*,/) 정수 -> 정수 (자동형변환), 유니코드
		//(char)(문자 + 정수) => 문자 : 명시적형변환(=강제형변환)
		
		System.out.println("암호 : " + password);
		encryptedPassword = encryption(password);
		System.out.println("암호화 후 암호 : " + encryptedPassword);
		
		decodingPassword = decoding(encryptedPassword);
		System.out.println("복호화 후 암호 : " + decodingPassword);
		
		
	}
	//#1. 암호화
	public static String encryption(String password) {
		String encryptedPassword = "";
		//문자 하나를 읽어서 * 5를 한 코드로 변환 => (char)(password.charAt(i)*5)
		for(char c : password.toCharArray()) { //for(int i = 0; i < password.length; i++){
											//	char c = (char)(password.charAt(i)+100)
			encryptedPassword+=(char)(c*KEY_VALUE);
		}
		return encryptedPassword;
	}
	//#2. 복호화 : 암호화된 문자열 풀기
	public static String decoding(String x) {
		String decodingPassword = "";
		for(char c : x.toCharArray()) {
			decodingPassword += (char)(c/KEY_VALUE);
		}
		
		return decodingPassword;
	}

}
