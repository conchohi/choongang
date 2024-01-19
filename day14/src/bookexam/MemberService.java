package bookexam;

public class MemberService {
	private String id = "hong";
	private String password = "12345";
	
	public MemberService() {;
	}
	
	public boolean login(String id, String password) {
		return (id.equals(this.id) && password.equals(this.password));
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
