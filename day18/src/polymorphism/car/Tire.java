package polymorphism.car;

public class Tire {
	public int maxRotation; //최대 회전수, 타이어 수명, 최대 회전수에 도달하면 펑크
	public int accumulateRotation;// 누적 회전수, 회전할 떄마다 1 증가
	public String location;//타이어 위치, 앞왼쪽, 앞오른쪽, 뒤왼쪽, 뒤오른쪽
	
	//생성자 - 타이어 위치와 최대 회전수 매개값
	public Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	/*
	 roll() 메소드는 타이어를 1회전 시키는 메소드
	 1번 실행할 때마다 누적 회전수 1씩 증가 : accumulateRotation++
	 누적회전수 < 최대회전수 : 남은 회전수 출력
	 		== 		  : 펑크 출력
	 -> if {누적회전수 < 최대회전수} else { }
	
	 roll() 메소드의 리턴 타입 : boolean 
	 정상이면 : true / 펑크 : false
	 */
	
	
	public boolean roll() { //roll() 메소드의 리턴 타입 : boolean
		accumulateRotation++; //1번 실행할 떄마다 누적 회전수 1씩 증가
		if(accumulateRotation < maxRotation) { //누적 회전수 < 최대 회전수
			System.out.println(location + "타이어 수명 : " + 
		(maxRotation - accumulateRotation) + "회");
			return true;
		} else { //누적회전수 == 최대회전수 일 떄 펑크 출력
			//~~위치의 타이어가 펑크남을 표시
			System.out.println("*** " + location + " 타이어 펑크 ***");
			return false;
		}
	}
}
