//�͸��� Ŭ����
package com.sist.inter;
interface A{
	public void display();
}
public class MainClass4{

	public static void main(String[] args){
		//�͸��� Ŭ���� => �������̽��� �̿��� ������(�������̵�)
		//class=> implements ���� �������̽� ���� ����
		//�� implements�� �ȹ޾Ƶ� ��. main �ȿ��� �޸� �Ҵ��ϰ� �޼ҵ� �����ϴ� �͵� ����.
		//�ٸ�, �޼ҵ尡 ���� ��� ������ �� �־ Ư���� ��찡 �ƴϸ� implements�� ���� ����
		A a=new A() {
			public void display() {
				System.out.println("A:displayCall...");
			}
		};
		a.display();
	}

} //�� ª�Ծ��� ���: ���ٽ�(���߿� ���)
