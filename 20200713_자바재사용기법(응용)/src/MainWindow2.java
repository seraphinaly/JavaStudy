import java.awt.Color;

import javax.swing.*;
/*	
 * 자바의 모든 클래스는 Object 클래스를 상속받음(생략,컴파일러가 자동으로 추가)
 */
public class MainWindow2{
	JFrame f=new JFrame();
	public MainWindow2(){
		f.setSize(800,600);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new MainWindow2();
		
	}

}
