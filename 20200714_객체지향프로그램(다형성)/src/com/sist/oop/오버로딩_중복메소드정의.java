package com.sist.oop;
/*package: ���� �̸�>>.���� ����(com,sist,oop 3�� ����)
 *    com.ȸ���.��ɸ�; ->com.sist.client;, com.sist.server;
 *    org.������.��ɸ�; ->org.springframework.web.servlet.view.*;
 * �ڹ� ��ü����
 *   1��°��:package��(1���� ���)
 *   2��°��:import
 *   3��°��:public class className{
 *           �ʿ��� ���� ����=>�������
 *           ������ ���� �ʱ�ȭ=>������
 *           ���=>�޼ҵ�
 *         }
 *   =>�ٸ� Ŭ�������� ����
 *   	import com.sist.oop.*; 
 *   
 *     ĸ��ȭ
 *     	=>������ private
 *     	=>�޼ҵ�� public ==> ���� getter/setter
 *     ���:extends~, ���ϻ�Ӹ� ����
 *     ������: ����,�߰�
 *     =========(��ü����:���������� �ƴ϶� �������)
 */
/*�����ε�(�����ڿ��� �ַ� ���)
 * ���� �޼ҵ������ ���� ���� ����� �����
 * 1.�Ű������� �޶����(����,��������)
 * 2.�������� ����X
 * 3.���� Ŭ���� �ȿ��� ���� �� �ִ�
 */

class Calc{
	//�ν��Ͻ� �޼ҵ�: new ����Ҷ� ����Ǵ� �޼ҵ�
	public void plus(int a, int b) {
		System.out.printf("%d+%d=%d\n",a,b,a+b);
	}
//	public int plus(int a, int b) { //������ ������� �Ű����� ���� ������ ���� �޼ҵ�
//		return a+b;
//	}
	public void plus(double a,double b) {
		System.out.printf("%f+%f=%f\n",a,b,a+b);
	}
	public void plus(String a,String b) {
		System.out.printf("%s+%s=%s\n",a,b,a+b);
	}
}
/*
 * �޼ҵ�
 * 	����޼ҵ�
 * 	static�޼ҵ�: �����̶� �ν��Ͻ� ���� ���Ұ�
 */
public class �����ε�_�ߺ��޼ҵ�����{
	int a=10;
	static int b=20;
	public �����ε�_�ߺ��޼ҵ�����() {
		System.out.println("this="+this);
	}
	
	public void disp1(int aa) {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println("this="+this);
	}
	
	public static void disp2() { //this�� ����(�����̶� ���� ���� ����)
		�����ε�_�ߺ��޼ҵ����� aa=new �����ε�_�ߺ��޼ҵ�����();
		System.out.println(aa.a);
		System.out.println(b);
	}
	
	public static void main(String[] args){
		Calc cc=new Calc();//�޼ҵ� ��ü ����
		cc.plus("Hello", "Java");
		cc.plus(100, 200);
		�����ε�_�ߺ��޼ҵ����� aa=new �����ε�_�ߺ��޼ҵ�����();
		System.out.println("aa="+aa);
		System.out.println(aa.a);
	}

}
