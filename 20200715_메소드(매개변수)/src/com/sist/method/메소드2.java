package com.sist.method;

import java.lang.reflect.Method;

class A{
	public void display1(String name){
		System.out.println("Hello~~\t"+name);
	}

	public void display2(String name){
		System.out.println("Hello~~\t"+name);//������ ������ �Ǿ ���� ����°� ����>>�浹 ���
	}
}

public class �޼ҵ�2{

	public static void main(String[] args){
		//		A a=new A();
		//		a.display("ȫ�浿");

		//�޸��Ҵ�
		try{
			Class clsName=Class.forName("com.sist.method.A");
			Object obj=clsName.newInstance();
			//System.out.println(obj);
			//			A a=(A)obj; //�׻� ����ȯ ���Ѿ���
			//			a.display("������");
			Method[] method=clsName.getDeclaredMethods();//java.lang.reflect
			//method[0].invoke(obj,"������");//�پ��� �Ű����� ���� � �޼ҵ�� ȣ���� �� �ְ�
			
			for(Method m : method){
				System.out.println(m.getName());//������ �� �� ����->0,1�� �����Ҽ� ����->Annotation �ʿ�
			}
		} catch(Exception ex){
		}
	}

}
