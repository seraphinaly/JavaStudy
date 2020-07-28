package login;

import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame{
	CardLayout card=new CardLayout();
	Login login=new Login();

	public MainForm(){
		setLayout(card);
		add("LOGIN", login);
		//★★배경색 수정 예정
		setBackground(Color.white);
		setSize(1920, 1080);
		setVisible(true);
	}

	public static void main(String[] args){
		new MainForm();
	}
}