package com.sist.util;
import java.util.*;
public class MainClass3_날짜예약관련_자르기{

	public static void main(String[] args){
	Random r=new Random();
		int[] resDay=new int[r.nextInt(10)+5]; //예약날짜 랜덤발생(5~14)
		
		String day="";
		for(int i=0;i<resDay.length;i++) {
			resDay[i]=r.nextInt(31)+1;
			day+=resDay[i]+"|";
		}
		day=day.substring(0, day.lastIndexOf("|")); //맨마지막 | 하나 지우기
		System.out.println(day);
		
		//날짜별 분리
		//split사용
		String[] resdays=day.split("\\|"); 
		//split은 정규식 패턴이 들어감, 익숙하지 않으면 StringTokenizer 사용권장
		/*정규식 기호: ^ : 시작문자 
		  				^[A-Za-z}:알파벳으로 시작하는 모든것
		  				^[가-힣]:한글로 시작하는 모든 것 //cf.[^가-힣]:한글을 제외한
		  				^[0-9]:숫자로 시작하는 모든것
		 				<지니뮤직> 3상승: [^가-힣] =>3
		 						 1하강: [^0-9] =>하강
					$ : 끝문자 
					 ex)A$ :A로 끝나는 단어
					. : 임의의 한글자(모든글자) => \\.
					| : 선택
					? : 있으면 출력, 없으면 미출력
		*/			
		for(String s:resdays)
		System.out.println(s);
		
		System.out.println("===StringTokenizer===");
		StringTokenizer st=new StringTokenizer(day, "|");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
