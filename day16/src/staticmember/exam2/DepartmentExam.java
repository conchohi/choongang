package staticmember.exam2;

import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Sales> salesList = new ArrayList<>();
		ArrayList<Planning> planningList = new ArrayList<>();
		
		while(true) {
			System.out.println("자료를 입력하시겠습니까? (예 | 아니오)");
			String option = sc.nextLine();
			if(option.equals("예")) {
				System.out.println("부서 성명 본봉 수당 순으로 입력하세요");
				String department = sc.next();
				String name = sc.next();
				int salary = Integer.parseInt(sc.next());
				int extra = Integer.parseInt(sc.next());
				sc.nextLine();
				if(department.equals("영업")) {
					salesList.add(new Sales(name,salary,extra));
				} else if(department.endsWith("기획")) {
					planningList.add(new Planning(name, salary, extra));
				}
			} else if(option.equals("아니오")) {
				System.out.println("입력을 종료합니다.");
				break;
			} else {
				System.out.println("예, 아니오 중 하나를 입력하세요");
			}//end of if
		}//end of while
		
		System.out.println("------------ 사원 급여표 ---------------");
		System.out.println("부서\t성명\t본봉\t수당\t합계");
		for (Sales sales : salesList) {
			sales.printInfo();
		}
		System.out.println("부서 합계 : " + Sales.getSalesTotal());
		System.out.println("-------------------------------------");
		for (Planning planning : planningList) {
			planning.printInfo();
		}
		System.out.println("부서 합계 : " + Planning.getPlanningTotal());
		System.out.println("-------------------------------------");
		System.out.println("전체 합계 : " + (Sales.getSalesTotal()+Planning.getPlanningTotal()));
		sc.close();
		
	}

}
