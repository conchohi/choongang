package accessmodifier.test1;

import accessmodifier.Modifiers;

public class ModifierDefaultExam {

	public static void main(String[] args) {
		Modifiers modifiers = new Modifiers();
		
		//필드의 접근제한자 - private
//		System.out.println("modifiers.priName : " + modifiers.priName);
//		System.out.println("modifiers.priAge : " + modifiers.priAge);
		
		//필드의 접근제한자 - default
//		System.out.println("modifiers.defName : " + modifiers.defName);
//		System.out.println("modifiers.defAge : " + modifiers.defAge);
//		modifiers.defAge = 20;
//		modifiers.defName = "이강산";
//		
//		System.out.println();
		
		//필드의 접근제한자 - public
		System.out.println("modifiers.pubName : " + modifiers.pubName);
		System.out.println("modifiers.pubAge : " + modifiers.pubAge);
		modifiers.pubAge = 15;
		modifiers.pubName = "김바다";
		
		System.out.println();

		modifiers.showInfo();

	}

}
