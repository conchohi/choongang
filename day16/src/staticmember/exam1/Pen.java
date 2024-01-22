package staticmember.exam1;

public class Pen {
	private String color;
	private int count;
	private int allCount;
	
	public Pen(String color) {
		this.color = color;
		
		//대소문자 구분하지 않고 비교 -> color.equalsIgonoreCase()
		if(color.equalsIgnoreCase("red")){
			count++; //red pen 개수 누적, red 펜 객체 개수
		}
		allCount++; //전체 pen의 개수 누적, 전체 객체 생성 개수
	}

	public String getColor() { //private으로 설정된 필드 외부에서 읽어서 이용할 수 있도록
								//private 필드 호출해서 리턴
		return color;
	}

	//개별 pen 개수
	public int getCount() {
		return count;
	}

	//전체 pen 개수
	public int getAllCount() {
		return allCount;
	}
}
