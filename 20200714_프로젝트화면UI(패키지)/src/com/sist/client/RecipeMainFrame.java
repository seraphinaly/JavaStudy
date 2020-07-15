package com.sist.client;
import com.sist.common.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/* �ڹ� ��Ű�� => java(JDK1.0~)=>Java, javax(JDK1.2~)=>Java2(SUN), JDK1.8(Oracle)
 * 	1.8=> JavaScript ��ü ����, ���ٽ�(�Լ�������:->)
 *        ==========web������ ��밡��:ES5=>ES6
 *                                     ====���ٽ�
 * 
 */
public class RecipeMainFrame extends JFrame implements ActionListener{
	//��ġ
	CardLayout card=new CardLayout();
	Login login=new Login();
	JoinForm join=new JoinForm();
	RecipeManager rm=new RecipeManager();
	public RecipeMainFrame(){
		
		//GUI ȭ�� ������, ���� �ʱ�ȭ, DB ����, ���� ����, ������ ����
		//Layout=>ȭ�� ��ġ
		setLayout(card);
		
		//ȭ���߰�
		add("RM",rm);
		add("LOGIN",login);
		add("JOIN",join);
		setSize(1024, 960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//â �ݾ��� �� �޸� ȸ��(������ư)
		
		login.b2.addActionListener(this);
		join.b3.addActionListener(this);
	}

	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new RecipeMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==login.b2) {//Ŭ���� ��ư
			card.show(getContentPane(), "JOIN");
		}
		else if(e.getSource()==join.b3) {//Ŭ���� ��ư
			card.show(getContentPane(), "LOGIN");
		}
	}

}
