package weight;

public class WeightChange {
	//#1. 필드 - 이름, 키, 몸무게 - private(외부에서 접근 불가, 같은 클래스 내에서는 접근 가능)
							  //생성자, getter/setter로 접근
	private String name;
	private double height;
	private double weight;
	
	//#2. 생성자 - WeightChange(이름,키,몸무게)
	public WeightChange(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	//#3. 메소드 - getter/setter - private으로 선언된 필드를 외부에서 사용할 수 있도록
	
	
	//#4. 메소드 몸무게 변화를 체크 - weightInfo(변화된 몸무게를 받아서 처리)
	public void weightInfo(double weight) {
		if(weight > 0) {
			//몸무게가 증가했을 때, 몸무게 증가 메소드 호출
			gainWeight(weight);
		} else if(weight < 0) {
			//몸무게가 감소했을 때, 몸무게 감소 메소드 호출
			reduceWeight(weight);
		} else {
			System.out.println("몸무게 변화가 없습니다.");
		}
	}
	
	private void gainWeight(double weight) {//weight - 매개변수, this.weight - 필드
		System.out.printf("몸무게 증가 전 몸무게 : %.2fkg 입니다.\n", this.weight);
		this.weight += weight;
		System.out.printf("%.2fkg 만큼 증가해서 현재 %.2fkg 입니다.",weight,this.weight );
	}
	
	private void reduceWeight(double weight) {
		System.out.printf("몸무게 감소 전 몸무게 : %.2fkg 입니다.\n", this.weight);
		this.weight += weight;		
		System.out.printf("%.2fkg 만큼 감소해서 현재 %.2fkg 입니다.",weight,this.weight );
	}
	
	//#5. 메소드 몸무게 증감 정보 출력 - showPrintInfo
	public void showMemberInfo() {
		System.out.println("*** " + name + "님의 건강 정보 ***");
		System.out.println("키 : " + height + "cm");
		System.out.printf("몸무게 : %.2fkg\n", weight);
	}
}
