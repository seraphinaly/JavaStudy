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
		MainClass m=new MainClass(); //m�� random() ����
		m.random();
		MainClass m1=new MainClass(); //���� ����=>�ν��Ͻ� �޼ҵ�
		m1.random();//���� �ҷ��� �۵���
		
		//����� ���� �޼ҵ�� �ڵ�ȣ���� ����
	}

}
