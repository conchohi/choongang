package interfaceexam.bookexam;

public class RemoteControlExam {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();

		rc = new Audio();
		rc.turnOn();
		
		RemoteControl[] rc1 = {
				new Television(),
				new Audio()
		};
		
		for(RemoteControl r : rc1) {
			r.turnOn();
			
			//자식 -> 부모 -> 자식
			if(r instanceof Television tv) {
				tv.turnOff();
			}
			
			//자식 -> 부모 -> 자식
			if(r instanceof Audio) {
				Audio audio = (Audio)r;
				audio.turnOff();
				
				//((Audio)r).turnOff()
			}
		}
	}

}
