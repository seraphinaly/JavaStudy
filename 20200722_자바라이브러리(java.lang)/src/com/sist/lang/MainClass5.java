package com.sist.lang;

/* finalized(): �Ҹ���(�޸� ����)
 */
class C{
	public void display(){
		System.out.println("C:display() Call...");
	}

	@Override
	protected void finalize() throws Throwable{
		System.out.println("�޸� ����");
	}
}

public class MainClass5{
	public static void main(String[] args){
		C c=new C();
		c.display();
		//�Ҹ�
		c=null; //GC���
		System.gc();
	}

}
