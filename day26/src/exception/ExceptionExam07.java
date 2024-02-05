
package exception;

public class ExceptionExam07 {

	public static void main(String[] args) throws ClassNotFoundException {
		findClass(); //main에서 던지면 JVM이 받음
	}
	
//	public static void main(String[] args) {
//		try {
//			findClass();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} 
//
//	}
	
	public static void findClass() throws ClassNotFoundException {
//		Class c = Class.forName("java.lang.String2");
	}

//	public static void main(String[] args) {
//		findClass();
//	}
//	public static void findClass() {
//		try {
//			Class c = Class.forName("java.lang.String2");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}


}
