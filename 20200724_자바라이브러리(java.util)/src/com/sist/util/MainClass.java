package com.sist.util;

import java.util.Random;

/*
 * Random
 * ***StringTokenizer
 * Date
 * ***Calendar
 * ***ArrayList,Vector
 * ***HashMap
 * ==========
 * regex
 * reflect =>web
 */
//random: instance!!
public class MainClass{
	public void random() {
		Random r=new Random();
		int a=r.nextInt();
		System.out.println(a);
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		MainClass m=new MainClass(); //m에 random() 저장
		m.random();
		MainClass m1=new MainClass(); //따로 저장=>인스턴스 메소드
		m1.random();//따로 불러야 작동함
		
		//사용자 정의 메소드는 자동호출이 없다
	}

}
