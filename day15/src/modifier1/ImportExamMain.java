package modifier1;

import accessmodifier.sample.testexam.Abc;
//import accessmodifier.test1.exam1.Abc;

public class ImportExamMain {

	public static void main(String[] args) {
//		accessmodifier.sample.testexam.Abc abc = new accessmodifier.sample.testexam.Abc();
		Abc abc = new Abc(); //import 사용
		//Cde cde = new Cde(); 에러. Cde 클래스는 디폴트 클래스라서
		
		accessmodifier.test1.exam1.Abc testAbc = new accessmodifier.test1.exam1.Abc();
		
		abc.setName("김자바");
		testAbc.setName("홍길동");
		System.out.println(abc.getName());
		System.out.println(testAbc.getName());
		
	}

}
