package com.sist.client;
import java.awt.*;
import javax.swing.*;
//�κ��� �ٲٷ��� �г��� �ٲٰ� 
//��ü�� �ٲٷ��� �������� �ٲ���Ѵ�.
public class MenuForm extends JPanel{
	JButton b1,b2,b3,b4,b5,b7;
	public MenuForm() {
		setBackground(Color.orange);
		b1 = new JButton("Ȩ");
		b2 = new JButton("�ڰ���?");
		b3 = new JButton("���Դ�?");
		b4 = new JButton("��𰡴�?");
		b5 = new JButton("��������?");
		b7 = new JButton("����");	
		
		setLayout(new GridLayout(6,1,5,5));//panel��  ���ٿ� ��µǰ� flow���̾ƿ��� default�� �������ִ�
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b7);
	}
}