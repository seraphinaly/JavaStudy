/*
  재사용: 기존에 만들어진 클래스 사용
  1)상속(inheritance,is-a)
  2)포함(has-a)
 */
import javax.swing.*;
public class MainClass extends JFrame{
//	public MainClass() { //생성자는 가급적이면 public 메소드로 만든다
//		
//	}
	
/*	public class A{
 *		private String name;
 *		int age;
 *		public void display();
 *	} 
 *	
 *	public class B extends A{ =>A의 내용이 B에 다 내려가는데, 예외는 private/static/생성자
 *		int age;//안보임
 *		public void display();//안보임
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
