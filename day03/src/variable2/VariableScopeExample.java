package variable2;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 =15; //지역변수, {}안에서만 사용,
					// {}을 벗어나면 메모리에서 사라짐
//		if (v1 > 10) {
//			int v2; //지역변수
//			v2 = v1 - 10;
//		} //v2가 메모리에서 사라짐
//		
//		int v2 = 0; //지역변수
		if (v1 > 10) {
//			int v2; //지역변수, 재선언이지만 오류 X
//			v2 = v1 - 10;
		} //v2가 메모리에서 사라짐
		
//		int v3 = v1 + v2 + 5;
	} //v1,v2,v3 메모리에서 삭제

}
