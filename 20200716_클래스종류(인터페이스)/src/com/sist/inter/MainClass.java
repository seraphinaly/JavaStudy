package com.sist.inter;
interface ����{ //����Ŭ����: Ŭ������ ������ ��� ���(�߻�ȭ)
	void eat();
	default void run() { //jdk1.8���� ���� ����
		System.out.println("�� �߷� �ȴ´�");
	}
}
class �� implements ����{ //���
	public void eat(){
		System.out.println("�Ұ��� �Դ´�");
	}
}

class �� implements ����{
	public void eat() {
		System.out.println("������ �Դ´�");
	}
}
class ��� implements ����{

	@Override
	public void eat(){
		System.out.println("������ �Դ´�");
	}

	@Override
	public void run(){
		System.out.println("�� �߷� �ȴ´�");
	}
	
	
}
class ���� implements ����{
	public void eat() {
		System.out.println("�������� �Դ´�");
	}
}
public class MainClass{
	public static void main(String[] args){
		���� ani=new ��();
		ani.eat();
		ani.run();
		
		ani=new ��();
		ani.eat();
		ani.run();
		
		ani=new ����();
		ani.eat();
		ani.run();
		
		ani=new ���();
		ani.eat();
		ani.run();
	}

}
