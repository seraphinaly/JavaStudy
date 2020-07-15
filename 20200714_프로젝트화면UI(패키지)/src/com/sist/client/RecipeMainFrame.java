package com.sist.client;
import com.sist.common.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* 자바 패키지 => java(JDK1.0~)=>Java, javax(JDK1.2~)=>Java2(SUN), JDK1.8(Oracle)
 * 	1.8=> JavaScript 자체 제어, 람다식(함수포인터:->)
 *        ==========web에서만 사용가능:ES5=>ES6
 *                                     ====람다식
 * 
 */
public class RecipeMainFrame extends JFrame implements ActionListener{
	//배치
	CardLayout card=new CardLayout();
	Login login=new Login();
	JoinForm join=new JoinForm();
	RecipeManager rm=new RecipeManager();
	public RecipeMainFrame(){
		
		//GUI 화면 디자인, 변수 초기화, DB 연결, 서버 연결, 쓰레드 동작
		//Layout=>화면 배치
		setLayout(card);
		
		//화면추가
		add("RM",rm);
		add("LOGIN",login);
		add("JOIN",join);
		setSize(1024, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//창 닫았을 때 메모리 회수(빨간버튼)
		
		login.b2.addActionListener(this);
		join.b3.addActionListener(this);
	}

	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new RecipeMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==login.b2) {//클릭한 버튼
			card.show(getContentPane(), "JOIN");
		}
		else if(e.getSource()==join.b3) {//클릭한 버튼
			card.show(getContentPane(), "LOGIN");
		}
	}

}
