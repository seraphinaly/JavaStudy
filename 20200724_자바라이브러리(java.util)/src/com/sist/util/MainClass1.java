package com.sist.util;
/*StringTokenizer:단어별로 분리
 * 
 */

import java.util.StringTokenizer;

public class MainClass1{

	public static void main(String[] args){
		String msg="Red,Green,Blue,Black,Yellow";
		StringTokenizer st=new StringTokenizer(msg, ","); //공백으로 자를때는 생략 => (msg)
		String color1=st.nextToken();
		String color2=st.nextToken();
		String color3=st.nextToken();
		String color4=st.nextToken();
		String color5=st.nextToken();
		//	String color6=st.nextToken();
		System.out.println(color1);
		System.out.println(color2);
		System.out.println(color3);
		System.out.println(color4);
		System.out.println(color5);
		//System.out.println(color6);

		st=new StringTokenizer(msg, ",");
		while(st.hasMoreTokens()){
			String color=st.nextToken();
			System.out.println(color);

		}

	}
}
