package com.sist.lang;
class Change{
	int x,y;
}
public class MainClass2{
	public void swap2(Change c) {
		System.out.println("c="+c);
		int temp=c.x;
		c.x=c.y;
		c.y=temp;
	}
	public void swap(int x, int y) {
		int tmp=x;
		x=y;
		y=tmp;
	}
	public static void main(String[] args){
		MainClass2 m=new MainClass2();
		int x=10;
		int y=20;
		System.out.println("������:x="+x+",y="+y);
		
		m.swap(x,y);
		System.out.println("������:x="+x+",y="+y); //:call by value(�޸� ����)
		
		//�ּҰ� ����: call by reference(�Ϲݺ��� �Ѿ�� �ȹٲ�, Ŭ���� �Ѿ�� �ٲ�)
		//��, String�� (Ŭ��������)�Ϲݺ��� ���
		/* �Ű����� => class, �迭 => ����(�ּ�)
		 *       => �⺻��������, String => ���纻(call by value�� ���)
		 */
		Change cc=new Change();
		System.out.println("cc="+cc);
		cc.x=10;
		cc.y=20;
		System.out.println("������:cc.x="+cc.x+",cc.y="+cc.y);
		m.swap2(cc);
		System.out.println("������:cc.x="+cc.x+",cc.y="+cc.y);
	}
}
