package com.sist.lib;
import java.util.*;
public class MainClass2{

	public static void main(String[] args){
		//#List �迭(���ټ�,�ӵ�(����ȭ) ����)
		//ArrayList<String> names=new ArrayList<String>();
		//Vector<String> names=new Vector<String>();
		LinkedList<String> names=new LinkedList<String>();
		names.add("������");
		names.add("���ϼ�");
		names.add("����â");
		names.add("������");
		names.add("�ں�ȣ");
		System.out.println("����� ����:"+names.size());
		//���
		for(int i=0;i<names.size();i++) {
			//������ ���� ��
			String name=names.get(i); //get:���ϴ� ��ġ�� ����� ������ �б�
			System.out.println(name+":"+i); //index�� �ڵ�����:0������!
		}
		System.out.println("=============");
		//���ϴ� ��ġ�� ���
		//1.add(); => �ڵ����� 5���� �߰�
		//2.add(index,"��"); =>���ϴ� ������ �߰�
		names.add(2,"����");
		for(int i=0;i<names.size();i++) {
			String name=names.get(i); 
			System.out.println(name+":"+i);
		}
		System.out.println("=============");
		
		//����
		names.remove(3);
		for(int i=0;i<names.size();i++) {
			String name=names.get(i); 
			System.out.println(name+":"+i);
		}
		System.out.println("=============");
		
		//����
		names.set(0, "����â");
		for(int i=0;i<names.size();i++) {
			String name=names.get(i); 
			System.out.println(name+":"+i);
		}
		System.out.println("=============");
		
		//��ü ����
		names.clear();
		System.out.println("����� ����:"+names.size());
	}

}
