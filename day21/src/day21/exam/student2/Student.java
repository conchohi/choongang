package day21.exam.student2;

public class Student {
		//#1. 필드
		String sn; //학번
		String name; //이름
		//과목을 받아서 배열에 저장 - 과목 타입의 배열 생성
		//과목과 점수를 담고 있는 배열은 여러곳에서 사용 -> 필드
		//수강과목의 수는 객체를 생성하는 순간 정해짐
		Subject[] subjects; //Subject 타입의 객체의 주소를 담는 배열
		
		//#2. 생성자
		public Student(String name, String sn, int subjectCount) { //수강과목 수
			this.name = name;
			this.sn = sn;
			//수강과목수를 넘겨받아 배열 공간을 확보, 배열 초기화 시키기
			this.subjects = new Subject[subjectCount];
		}
		
		//#3. 메소드
		void addSubject(String subjectName, int subjectScore) {
			//외부에서 넘겨 받은 과목과 점수를 이용해서 객체 생성
			Subject newSubject = new Subject(subjectName, subjectScore);
			
			//생성된 객체를 subjects에 담음
			//subjects 배열에 빈 공간이 있는지 확인하고 없으면 끝내고, 있으면 새로 생성된 객체의 주소를 담기
			//배열 공간만큼 반복 - > for문, null인지 아닌지 -> if문
			
			for(int i = 0; i < subjects.length; i++) {
				if(subjects[i] == null) { //공간이 null이면 객체를 저장하고
					subjects[i] = newSubject;
					//이미 생성한 객체 하나를 빈 공간에 담았으면 더이상 반복 실행 X
					break; 
				}//end of if
			}//end of for
		}//end of addSubject
		
		int sum;
		double avg;
		
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
//				System.out.println(s.subjectName + " : " + s.subjectScore);
				s.subjectInfo();
			}
		}

}
