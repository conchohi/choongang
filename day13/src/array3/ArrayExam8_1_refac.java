package array3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayExam8_1_refac {
   static Scanner scan = new Scanner(System.in);  
   
   static String[] beverage = {"아메리카노", "라떼", "콜라", "홍차"}; //음료 종류
   static int[] price = {2500, 4500, 1500, 5500}; // 음료가격
   static int[] numberOfOrders = new int[4]; //음료가 4개 이기때문에 공간은 4개만 필요
   										// 주문 수량을 누적할 변수
   static int[] amountOfMoney = new int[4]; //개별 주문 금액을 누적할 공간
   
   public static void main(String[] args) {
      
       //#2. 변수 선언
       int continuingOrNot = 0; //주문 계속할 지 여부
       int beverageChoice = 0; //음료 선택 번호를 담을 변수
   
       
       //#3. 음료 판매 시작
       while(true) {
           //선택한 번호를 변수에 담기
           beverageChoice = choiceBeverage();
         
           //종료를 선택했을 때 프로그램을 종료 - 주문 종료이면 다른 것을 실행하지 않기 위해 
           // 이곳에 선언
           if(beverageChoice==0) {
                // break;  - 반복문을 종료
                System.out.println("주문 종료를 선택하셨습니다.");
                System.out.println("주문을 종료합니다.");
                System.exit(0);  //프로그램을 종료
           } //end of if
         
           System.out.println();
           
           //주문을 받은 음료의 수량과 가격을 누적
           eachOrder(beverageChoice-1);
           
           //주문을 계속할지 여부 묻기
           continuingOrNot = continueOrder();
           
           //2번을 선택하면 주문 종료
           if(continuingOrNot == 2) {
              break; //while문(반복)을 종료
           }
           System.out.println();
      }//end of while

       //결과를 출력하는 부분을 작성한 메소드 호출
      showPrint();
      
   }//end of main
   
   public static int choiceBeverage() {
       //주문 받는 메시지 출력
       System.out.println("음료 번호를 선택하세요...");
       System.out.println("===================================================================");
       System.out.println("1.아메리카노(2500)|2.라떼(4500)|3.콜라(1500)|4.홍차(5500)| 0. 종료");
       System.out.println("===================================================================");
       System.out.print("음료 선택>> ");
       
	   return scan.nextInt();
   }
   //주문을 받아 개별 계산
   public static void eachOrder(int beverageChoice) { //음료 번호를 매개값으로 넘겨 받음
	   //주문 종료가 아니면 주문 수량을 입력받기
       System.out.print("주문 수량 입력>>");
       int numbers = scan.nextInt();
     
       numberOfOrders[beverageChoice] += numbers;  // 주문 수량 누적
       amountOfMoney[beverageChoice] += numbers * price[beverageChoice];//주문 금액을 누적
       System.out.println();
   }//end of eachOrder method
   
   public static int continueOrder() {
	   System.out.println("주문을 계속하시겠습니까?");
       System.out.println("===========================");
       System.out.println("1.주문 계속 | 2.주문 종료");
       System.out.println("===========================");
       System.out.print("번호 선택 >>");
       
       return scan.nextInt();
   }
   
   public static void showPrint() {
       int totalPaymentAmount = 0; //총 주문금액을 담을 변수
       int totalOrderAmount = 0; //총 주문 수량을 담을 변수
       //금액과 수량을 표시하는 형식을 설정
       //import java.text.DecimalFormat; 되어 있어야 함
       DecimalFormat f1 = new DecimalFormat("0잔"); //수량의 패턴  -> 숫자를 문자열로 표시
       DecimalFormat f2 = new DecimalFormat("#,##0원"); //금액의 패턴  -> 숫자를 문자열로 표시  
       
	   System.out.println("============================================");
       System.out.println("음료명\t주문수량\t주문금액");
       System.out.println("============================================");
       for(int i=0; i < beverage.length; i++) {
           if(numberOfOrders[i] == 0) {
               continue; //for의 증감부분으로 되돌아 가기
           }//if문 끝
      
         //DecimalFormat 형식을 사용해서 출력
        System.out.printf("%s\t%s\t%s\n", beverage[i], f1.format(numberOfOrders[i]), f2.format(amountOfMoney[i]));   
        
         //주문 수량 합계 계산
        totalOrderAmount += numberOfOrders[i];
        totalPaymentAmount += amountOfMoney[i];         
         // 결제 금액 총액 계산
      }//for 끝
      
      
      //총 주문수량 합계와 결제 금액 총액 출력
       System.out.println("============================================");
       System.out.println("주문 수량 합계 : " + f1.format(totalOrderAmount));
       System.out.println("결제 금액 총계 : " + f2.format(totalPaymentAmount));  
   }
}//end of class