package com.sist.method;
class AA{
	public void AA() { //������(void) �پ ������ �ƴϰ� �Ϲ� �ν��Ͻ� �޼ҵ�!!(��void)
		System.out.println("AA() Call...");
	}
//	//������X:Ư���޼ҵ�=>�޸𸮿� ����
//	public AA() {
//		System.out.println("AA() Call...");
//	}
	public AA(int a) {
		System.out.println("AA() Call...");
	}

}
public class MainClass{

	public static void main(String[] args){
		AA a=new AA(10);
		a.AA();
	}

}
