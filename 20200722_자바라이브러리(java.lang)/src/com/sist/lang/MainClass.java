package com.sist.lang;

import java.util.*;
import java.sql.*;
/*
 * class A{
 * 	int a=10;
 * }
 * 
 * class B extends A{
 *  //int a
 * 	public B(){
 * 		this.a=100; //�ڽ��� Ŭ����
 * 		super.a=200;//��� ���� Ŭ����
 * 	}
 * }
 * 
 * **���
 *   extends => class(���ϻ��)
 *   implements => interface(���߻��)
 *   
 * **Ŭ����
 *    new => ó������ ����
 *    ���� => �����޸� ��� => Ŭ���� ��ü�� �Ű������� ������ ��
 *    ���� => ����Ȱͺ��� ����
 *    
 *    class A{
 *      int aa=10;
 *    }
 *    
 *     A aaa=new A();
 *      =>display(aaa); ==> aaa.aa=1000 : Call By Reference(�ϳ��� �޸𸮰����� ���� ��)
 *       								  cf. Call By Value(�޸� ���� ��)
 *    
 *    public void display(A a){
 *    	a.aa=1000;
 *    }
 */

class A implements Cloneable{
	int aa=10;
	public A clone() {
		A a=new A();
		try {
			a=(A)super.clone(); //����ȯ �ʼ�(clone=>Object)
		}catch(Exception e) {}
		return a;
	}
}

public class MainClass{
	public static void main(String[] args){
		A a=new A();
		a.aa=100;
		A b=new A();
		System.out.println(b.aa);

		A c=new A();
		System.out.println("c="+c.aa);
		c.aa=100;
		A d=c;//������ �������
		System.out.println(d.aa);
		d.aa=1000;
		System.out.println(c.aa);
		
		A e=c.clone();
		System.out.println(c.aa);
	}
}