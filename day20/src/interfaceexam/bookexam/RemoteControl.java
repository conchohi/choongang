package interfaceexam.bookexam;

public interface RemoteControl { //역할 설정, 완성이 아님
	//#1. 상수
	int MAX_VOLUME = 10; //public static final 생략
	int MIN_VOLUME = 0;
	
	//인터페이스는 생성자 사용할 수 없음
	
	//#2. 추상 메소드
	void turnOn(); //public abstract 생략, { } 가 없으므로 추상 메소드
	void turnOff();
	void setVolume(int volume);
}
