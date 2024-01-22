package staticmember.bookexam;

public class SingletoneExamMain {

	public static void main(String[] args) {
//		//에러 - 생성자 private -> 외부에서 객체 생성할 수 없음
//		SingletonExam singleObj1 = new SingletonExam(); 	
		
		SingletonExam singleObj1 = SingletonExam.getInstance();
		SingletonExam singleObj2 = SingletonExam.getInstance();
	
		if(singleObj1 == singleObj2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}
	}

}
