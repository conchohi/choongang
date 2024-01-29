package interfaceexam.bookexam;

public class MyClass {
	RemoteControl rc = new Television();

	public MyClass() {
	}
	
	public MyClass(RemoteControl rc) {
		this.rc = rc;
	}
	
	public void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	
	public void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
	
	

}
