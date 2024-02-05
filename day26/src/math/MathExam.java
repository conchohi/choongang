package math;

public class MathExam {

	public static void main(String[] args) {
		double d1 = 453.5389;
		double d2 = 321.3785;
		
		System.out.println(Math.max(10, 30)); //30
		System.out.println(Math.abs(-5)); //5
		
		//올림
		System.out.println(Math.floor(d1)); //453.0 
		System.out.println(Math.floor(d2)); //321.0
		
		//내림
		System.out.println(Math.ceil(d1)); //454.0 
		System.out.println(Math.ceil(d2)); //322.0
		
		//반올림
		System.out.println(Math.round(d1)); //454
		System.out.println(Math.round(d2)); //321
	}

}
