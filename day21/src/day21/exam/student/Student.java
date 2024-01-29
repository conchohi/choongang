package day21.exam.student;

public class Student {
	//#1. 필드
	String sn; //학번
	String name; //이름
	//과목을 받아서 배열에 저장 - 과목 타입의 배열 생성
	//과목과 점수를 담고 있는 배열은 여러곳에서 사용 -> 필드
	//수강과목의 수는 객체를 생성하는 순간 정해짐
	Subject[] subjects = null; //Subject 타입의 객체의 주소를 담는 배열
	int sum = 0;
	double avg = 0.0;
	
	//#2. 생성자
	public Student(String name, String sn) { //수강과목 수
		this.name = name;
		this.sn = sn;
	}
	
	public Student(String name, String sn, int subjectCount) { //수강과목 수
		this.name = name;
		this.sn = sn;
		//수강과목수를 넘겨받아 배열 공간을 확보, 배열 초기화 시키기
		this.subjects = new Subject[subjectCount];
	}
	
	//#3. 메소드
	private void calc() { //과목과 과목정보	
		//합계
		for(int i = 0; i < subjects.length; i++) {
			sum += subjects[i].subjectScore;
		}
		
		//평균
		avg = (double)sum / subjects.length;
	}
	
	void showInfo() {
		calc(); //먼저 계산
		//계산이 끝난 후 출력
		System.out.println("*** " + name + "님의 성적 ***");
		System.out.println("학번 : " + sn);
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);		
	}
	void checkScore() {
		//*** ~님 수강과목과 점수 확인 ***
		System.out.println("*** " + name + "님 수강과목과 점수 확인 ***");
		for(Subject s : subjects) {
//			System.out.println(s.subjectName + " : " + s.subjectScore);
			s.subjectInfo();
		}
	}

}
