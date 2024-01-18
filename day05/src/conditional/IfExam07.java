package conditional;

import java.util.Scanner;

public class IfExam07 {

	public static void main(String[] args) {
		/*
		문7) 여행하고 싶은 것을 입력받아 선택이 '산'이면
			여행 추천지는 '한라산'
			선택이 '바다'이면 여행 추천지는 '동해'로 처리하시오
			
			입력 형태)
			당신이 여행하고 싶은 곳을 아래에서 골라 입력하세요. 
			(산, 바다)
			
			출력 형태)
			당신이 선택한 여행 희망지는 '산'입니다.
			당신에게 추천하는 곳은 '한라산'입니다.
		 */
		Scanner sc = new Scanner(System.in);
		String wishTravle = "";
		String recommend = "";		
			
		System.out.println("당신이 여행하고 싶은 곳을 아래에서 골라 입력하세요.");
		System.out.println("(산, 바다)");
		wishTravle = sc.nextLine();
		
		if(wishTravle.equals("산")) {
			recommend = "한라산";
		} else if(wishTravle.equals("바다")) {
			recommend = "동해";
		} else {
			System.out.println("산, 바다 중 하나를 입력하세요.");
			return;
		}
		System.out.println("당신이 선택한 여행 희망지는 '" + wishTravle + "'입니다.");
		System.out.println("당신에게 추천하는 곳은 '" + recommend + "'입니다.");
		
		sc.close();
	}

}
