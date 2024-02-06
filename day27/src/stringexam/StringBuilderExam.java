package stringexam;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class StringBuilderExam {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("안녕!!");
		sb.append(" 즐거운 시간");
		sb.append(" 자바는 즐거워 ~ ");
		
		System.out.println(sb);
		sb.delete(1, 6);
		System.out.println(sb);
		
		String str = "java/html/python/css";
		
		StringTokenizer st = new StringTokenizer(str, "/");
		while(st.hasMoreTokens()) {
//			String token = st.nextToken();
//			System.out.println(token);
			System.out.println(st.nextToken());
		}
		
		String str2 = "안녕!!/java/즐거운 시간";
		String[] strs = str2.split("/| ");
		
		System.out.println(Arrays.toString(strs));
		
		System.out.println();
		
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		System.out.println();
		
		for (String string : strs) {
			System.out.println(string);
		}
		
		System.out.println();
		
		String str4 = "                    hello!!       java                    ";
		System.out.println(str4.trim());
	}

}
