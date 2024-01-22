package staticmember.exam2;

public class Print {
	// 초기 용지 : 100장, paperNumber = 100 : static
	// 인쇄방식 : 단면(true)과 양면(false) : int printMethod
	//			양면 = 인쇄할 매수 % 2 == 0 -> 인쇄매수 /2
	//				  인쇄할 매수 % 2 == 1 -> 인쇄매수 / 2  + 1
	// 인쇄할 매수를 입력 받기
	// 출력형태
	// ~장 출력
	// 남은 용지매수 : ~장
	private int paperNumber = 100;
	
	public Print() {}
	
	public void printShow(int printAmount, int printingMethod) {
		if(printingMethod == 1) {
			print(printAmount);
		} else if(printingMethod == 2) {
			//양면일 경우 나누기 2하고 소숫점이 남을 경우 한장 더 필요하므로 올림처리
			print((int)Math.ceil(printAmount / 2.0)); 
		} else {
			System.out.println("숫자를 잘못 입력했습니다. 처음으로 돌아갑니다.");
		}
	}
	
	
	private void print(int printAmount) {
		//현재 남은 용지가 없을 때, 인쇄할 용지가 현재 남은 용지보다 많을 때,
		//현재 남은 용지가 인쇄할 용지보다 작을 때 -> if ~ else if ~ else
		if(paperNumber == 0) { //현재 남은 인쇄 용지가 하나도 없을 때
			System.out.println("용지가 없습니다. 충전이 필요합니다.");
		} else if(paperNumber < printAmount) { //현재 남은 인쇄 용지가 인쇄할 매수보다 적을 떄
			//인쇄할 매수 - 기본용지 -> 부족
			System.out.println((printAmount - paperNumber) + "장이 부족합니다.");
			
			//기본 용지 만큼만 인쇄할 수 있음
			System.out.println("총 " + paperNumber + "장을 출력하였습니다.");
			//보충이 필요하기에 기본 용지를 0으로 세팅
			paperNumber = 0;
		} else { //현재 남은 인쇄 용지가 인쇄할 매수보다 많을 떄
			System.out.println("총 " + printAmount + "장을 출력하였습니다.");
			System.out.println("남은 용지 매수 : " + paperNumber);
			paperNumber -= printAmount;
		}
	}
	public int getPaperNumber() {
		return paperNumber;
	}
	
	//#용지 매수 충전하기 메소드
	public void chargePaper(int paper) {
		System.out.println("총 " + paper + "장을 충전하였습니다.");
		paperNumber += paper;
		
	}
}
