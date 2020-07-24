package com.sist.collection;

import java.util.ArrayList;

public class MainClass{

	public static void main(String[] args){
		ArrayList list=new ArrayList();
		
//		//추가
//		list.add(10); //0
//		list.add(10.5); //1
//		list.add("홍길동"); //2
//		list.add('A'); //3
//		//값 읽기
//		int a=(int)list.get(0); //get은 Object로 받음→형변환 필요
//		double d=(double)list.get(1);
//		String s=(String)list.get(2);
//		char c=(char)list.get(3);
//		
//		System.out.println(a);
//		System.out.println(d);
//		System.out.println(s);
//		System.out.println(c);
		
		list.add("이정후");//0
		list.add("김하성");//1
		list.add("박병호");//2
		list.add("서건창");//3
		list.add("이지영");//4
		
		for(int i=0;i<list.size();i++) { //데이터형이 같아야 가능
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		list.remove(2); //없어진 곳 밀려 올라와서 채움
		for(int i=0;i<list.size();i++) { 
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		list.add(2,"에디슨 러셀"); //2번으로 끼어들어감(기존 2번부터 하나씩 뒤로 밀림)
		for(int i=0;i<list.size();i++) { 
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
	}

}
