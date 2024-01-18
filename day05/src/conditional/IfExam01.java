package conditional;

public class IfExam01 {

	public static void main(String[] args) {
		/*
		문1) 회원이 구매한 물품 금액이 300000원 이상이면 
			'상품권 5천원 증정'으로 처리하세요
		 */
		int amount = 1500000;
		
		if(amount >= 300000) {
			System.out.println("상품권 5천원 증정");
		}

	}

}
