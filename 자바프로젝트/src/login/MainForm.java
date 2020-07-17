package login;
import javax.swing.*;
import java.awt.*;
public class MainForm extends JFrame{ 
	private CardLayout card=new CardLayout();
	
	Login login=new Login();
	public MainForm() {
		setLayout(null);
		
		add("LOGIN",login);
		setLayout(card);
		//★★배경색 수정 예정
		setBackground(Color.white);
		setSize(1920,1080);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new MainForm();
	}
}