package generic;

public class GenericExam {

	public static void main(String[] args) {
		Box<String,Integer> box = new Box<>();
		
		box.setName("홍길동");
		String name = box.getName();
		System.out.println(name);
		System.out.println();
		
		Box<Integer,Integer> box1 = new Box<>();
		box1.setAge(50);
		int age = box1.getAge();
		System.out.println(age);
		System.out.println();
	}

}
