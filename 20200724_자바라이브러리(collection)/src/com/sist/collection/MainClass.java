package com.sist.collection;

import java.util.ArrayList;

public class MainClass{

	public static void main(String[] args){
		ArrayList list=new ArrayList();
		
//		//�߰�
//		list.add(10); //0
//		list.add(10.5); //1
//		list.add("ȫ�浿"); //2
//		list.add('A'); //3
//		//�� �б�
//		int a=(int)list.get(0); //get�� Object�� ����������ȯ �ʿ�
//		double d=(double)list.get(1);
//		String s=(String)list.get(2);
//		char c=(char)list.get(3);
//		
//		System.out.println(a);
//		System.out.println(d);
//		System.out.println(s);
//		System.out.println(c);
		
		list.add("������");//0
		list.add("���ϼ�");//1
		list.add("�ں�ȣ");//2
		list.add("����â");//3
		list.add("������");//4
		
		for(int i=0;i<list.size();i++) { //���������� ���ƾ� ����
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		list.remove(2); //������ �� �з� �ö�ͼ� ä��
		for(int i=0;i<list.size();i++) { 
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		list.add(2,"���� ����"); //2������ �����(���� 2������ �ϳ��� �ڷ� �и�)
		for(int i=0;i<list.size();i++) { 
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
	}

}
