package array3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayExam3_7_1 {
	public static void main(String[] args) {
		//#1. Scanner 객체 생성 - 입력 받기 위해
		Scanner sc = new Scanner(System.in);
		
		//#2. 변수 선언 - 지역변수 {}안에서 사용
		int studentNum = 0; //학생수
		int[] scores = null;//배열은 한 번 크기를 설정하면 변경할 수 없음
							//null : 아직 참조하는 곳이 없음
		boolean run = true; //while문의 진행 여부를 설정하기 위해 사용
							//값이 true이므로 일단 반복을 진행
		
		//#3. while문을 실행해서 학생수, 점수입력, 점수리스트. 분석등을 진행
		while(run) {
			//#3-1. 메세지가 반복이므로 메세지부터 설정
			System.out.println("==================================================");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("==================================================");
			System.out.println("번호 선택 >> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) { //1. 학생수
				System.out.println("학생 수 입력 >> ");
				studentNum = Integer.parseInt(sc.nextLine());
				//학생수 만큼의 배열 공간을 만들어 주기, 위에서는 null로 정의하여 참조값이 아직 없음
				//공간 확보 필요
				scores = new int[studentNum]; //점수를 담을 배열
			} else if(selectNo == 5) {
				//종료 해야 함
				run = false;
				System.out.println("종료 선택하셨습니다");
			} else if(studentNum == 0) {
				System.out.println("학생 수를 먼저 입력하세요");
			} else if(selectNo == 2) { //2. 점수입력
				//배열 공간에 점수 담기 - 학생 수가 유동적이라 반복문 사용
				for(int i = 0; i < studentNum; i++) {//studentNum = scores.length
					System.out.println((i+1) + "번째 학생 점수 입력 >>");
					scores[i] = Integer.parseInt(sc.nextLine()); //입력받은 점수 배열에 담기
				}
			} else if(selectNo == 3) { //3. 점수 리스트
				for(int i = 0; i < studentNum; i++) {//studentNum = scores.length
					System.out.println((i+1) + "번 학생 점수 = " + scores[i]);
				}
			} else if(selectNo == 4) { //4. 분석
				int sum = 0; //합계
				int max = Integer.MIN_VALUE;//최고 점수를 초기화
				int min = Integer.MAX_VALUE;//최저 점수를 초기화
				double avg = 0.0;
				DecimalFormat f = new DecimalFormat("#0.##");
				
				//최댓값, 최솟값, 합계
				for(int i = 0; i < studentNum; i++) {//studentNum = scores.length
					//최댓값
					if(max < scores[i]) {
						max = scores[i];
					}
					
					//최솟값
					if(min > scores[i]) {
						min = scores[i];
					}
					//합계 - 평균을 구하기 위해서 필요
					sum += scores[i];//점수 누적해서 합계 구하기
				}
				
				avg = (double)sum / studentNum;
				System.out.println("최고 점수 : " + max);
				System.out.println("최저 점수 : " + min);
				System.out.println("평균 : " + f.format(avg));
			}//end of if
		}//end of while
		System.out.println("종료합니다.");
		sc.close();
	}//end of main

}//end of class
