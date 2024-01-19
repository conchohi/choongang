package accessmodifier;

public class Modifiers {
	private String priName = "홍가";
	private int priAge = 20;
	
	String defName = "김가";
	int defAge = 25;
	
	public String pubName = "최가";
	public int pubAge = 35;
	
	public void showInfo() {
		System.out.println("priName : " + priName);
		System.out.println("priAge : " + priAge);
		System.out.println();
		
		System.out.println("defName : " + defName);
		System.out.println("defAge : " + defAge);
		System.out.println();
		
		System.out.println("pubName : " + pubName);
		System.out.println("pubAge : " + pubAge);
	}
}
