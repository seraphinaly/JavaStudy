package com.sist.client;
import java.awt.*;
import javax.swing.*;
//부분을 바꾸려면 패널을 바꾸고 
//전체를 바꾸려면 프레임을 바꿔야한다.
public class MenuForm extends JPanel{
	JButton b1,b2,b3,b4,b5,b7;
	public MenuForm() {
		setBackground(Color.orange);
		b1 = new JButton("홈");
		b2 = new JButton("자고가니?");
		b3 = new JButton("뭐먹니?");
		b4 = new JButton("어디가니?");
		b5 = new JButton("뭐만들지?");
		b7 = new JButton("종료");	
		
		setLayout(new GridLayout(6,1,5,5));//panel은  한줄에 출력되게 flow레이아웃을 default로 가지고있다
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b7);
	}
}