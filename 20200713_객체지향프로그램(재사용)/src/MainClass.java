/*
  ����: ������ ������� Ŭ���� ���
  1)���(inheritance,is-a)
  2)����(has-a)
 */
import javax.swing.*;
public class MainClass extends JFrame{
//	public MainClass() { //�����ڴ� �������̸� public �޼ҵ�� �����
//		
//	}
	
/*	public class A{
 *		private String name;
 *		int age;
 *		public void display();
 *	} 
 *	
 *	public class B extends A{ =>A�� ������ B�� �� �������µ�, ���ܴ� private/static/������
 *		int age;//�Ⱥ���
 *		public void display();//�Ⱥ���
 *	}	
 */
	
//Main + (ctrl+space)
	public MainClass(){
		super.setSize(300, 300);
		this.setVisible(true);
	}

	public static void main(String[] args){
		new MainClass();

		
		
	}

}
