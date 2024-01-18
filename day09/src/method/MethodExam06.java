package method;

public class MethodExam06 {

	public static void main(String[] args) {
		//문6) 홍길동과 홍길순이가 가위(s), 바위(r), 보(p) 게임을 한다.
		//r, p, s 중 하나를 입력해 승자 또는 무승부를 출력하는 프로그램을 작성
		// 홍길동 : r, 홍길순 : s -> 홍길동 승
	}
	
	public static void rsp(String m, String f) {
		if(m.equals(f)) {
			System.out.println("무승부");
		}
	}

}
