package accessmodifier;

public class GetterSetterMainExam1 {

	public static void main(String[] args) {
		GetterSetterExam gs = new GetterSetterExam();
		GetterSetterExam gsconst = new GetterSetterExam("choong","4567");
		gs.show();
		
//		String result = gs.getId();
		
		gs.setId("가나다");
		gs.show();
		
		gsconst.show();
	}

}
