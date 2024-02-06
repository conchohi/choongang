package stringexam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date now = new Date(); //현재 날짜 
		System.out.println(now); //영문 표기
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow = f.format(now);
		System.out.println(strNow);
	}

}
