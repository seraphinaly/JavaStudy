package com.sist.method;
/* 메소드
 * 
 */
public class 메소드{
	public static void concat(String s,String... s1) { //String...:배열방식
		for(String ss:s1) {
			s+=ss;
		}
		System.out.println(s);
	}
	public static void main(String[] args){
//		Object o=10;
//		Object o1="aaaa";
//		Object o2='a';
//		Object o3=new 메소드();
		
		concat("오늘의선발:","서건창,","김하성,","이정후,","박병호");
		

	}

}
