package com.sist.client;

import java.awt.*;
import javax.swing.*;

public class JoinForm extends JPanel{
	private Image back1;
	JLabel title=new JLabel("ȸ������", JLabel.CENTER);
	JLabel la1, la2, la3, la4, la5, la6, la7, la8, la9, la10, la11;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6;
	JLabel dash=new JLabel("-");
	JButton b1;
	JButton b2=new JButton("�����ȣ �˻�");
	JButton b3=new JButton("ȸ������");
	JButton b4=new JButton("���");
	JPasswordField pf1, pf2;
	JRadioButton rb1, rb2;
	JTextArea ta;
	JCheckBox box1, box2, box3, box4, box5;
	JComboBox telBox=new JComboBox();
	JTextField tf7,tf8;
	JLabel dash2=new JLabel("-");
	
	//�ʱ�ȭ
	public JoinForm(){
		back1=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back1.jpg");
		la1=new JLabel("ID", JLabel.RIGHT);
		la2=new JLabel("��й�ȣ", JLabel.RIGHT);
		la3=new JLabel("���Է�", JLabel.RIGHT);
		la4=new JLabel("�̸�", JLabel.RIGHT);
		la5=new JLabel("����", JLabel.RIGHT);
		la6=new JLabel("�����ȣ", JLabel.RIGHT);
		la7=new JLabel("�ּ�", JLabel.RIGHT);
		la8=new JLabel("���ּ�", JLabel.RIGHT);
		la9=new JLabel("��ȭ��ȣ", JLabel.RIGHT);
		la10=new JLabel("�Ұ�", JLabel.RIGHT);
		la11=new JLabel("������", JLabel.RIGHT);

		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		tf6=new JTextField();
		tf7=new JTextField();
		tf8=new JTextField();

		pf1=new JPasswordField();
		pf2=new JPasswordField();

		rb1=new JRadioButton("����");
		rb2=new JRadioButton("����");
		ButtonGroup gb=new ButtonGroup();//�ϳ��� ���õǾ�� �ϱ� ������ �׷� ����
		gb.add(rb1);
		gb.add(rb2);

		b1=new JButton("�ߺ�üũ");

		title.setFont(new Font("���ʷҵ���", Font.BOLD, 35));//HTML:<h1><b>ȸ������</b></h1>

		//��ġ
		setLayout(null);
		title.setBounds(10, 15, 1000, 55);
		//�߰�
		add(title);

		la1.setBounds(300, 100, 80, 30);
		tf1.setBounds(385, 100, 200, 30);
		b1.setBounds(590, 100, 150, 30);
		add(la1);
		add(tf1);
		add(b1);

		la2.setBounds(300, 135, 80, 30);
		pf1.setBounds(385, 135, 200, 30);
		add(la2);
		add(pf1);

		la3.setBounds(300, 170, 80, 30);
		pf2.setBounds(385, 170, 200, 30);
		add(la3);
		add(pf2);

		la4.setBounds(300, 205, 80, 30);
		tf2.setBounds(385, 205, 200, 30);
		add(la4);
		add(tf2);

		la5.setBounds(300, 240, 80, 30);
		rb1.setBounds(385, 240, 95, 30);
		rb2.setBounds(485, 240, 95, 30);
		rb1.setOpaque(false);
		rb2.setOpaque(false);
		add(la5);
		add(rb1);
		add(rb2);

		la6.setBounds(300, 275, 80, 30);
		tf3.setBounds(385, 275, 100, 30);
		dash.setBounds(500, 275, 20, 30);
		tf4.setBounds(525, 275, 100, 30);
		b2.setBounds(630, 275, 150, 30);
		add(la6);add(dash);add(tf3);add(tf4);add(b2);
		
		la7.setBounds(300, 310, 80, 30);
		tf5.setBounds(385, 310, 400, 30);
		add(la7); add(tf5);
		
		la8.setBounds(300, 345, 80, 30);
		tf6.setBounds(385, 345, 400, 30);
		add(la8); add(tf6);
		
		telBox.addItem("010");
		telBox.addItem("011");
		telBox.addItem("017");
		
		la9.setBounds(300, 380, 80, 30);
		telBox.setBounds(385, 380, 100, 30);
		tf7.setBounds(490, 380, 100, 30);
		dash2.setBounds(595, 380, 30, 30);
		tf8.setBounds(610, 380, 150, 30);
		add(la9);add(telBox);add(tf7);add(tf8);add(dash2);

		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);

		la10.setBounds(300, 415, 80, 30);
		js.setBounds(385, 415, 400, 200);
		add(la10);add(js); //Panel�� �ø���
		
		box1=new JCheckBox("�Ұ��");
		box2=new JCheckBox("�������");
		box3=new JCheckBox("�߰��");
		box4=new JCheckBox("��ǻ");
		box5=new JCheckBox("ȸ");
		box1.setOpaque(false);
		box2.setOpaque(false);
		box3.setOpaque(false);
		box4.setOpaque(false);
		box5.setOpaque(false);
		
		JPanel p=new JPanel();
		p.setOpaque(false);
		p.add(box1);p.add(box2);p.add(box3);p.add(box4);p.add(box5);
		la11.setBounds(300, 620, 80, 30);
		p.setBounds(385, 620, 400, 35);
		add(la11);add(p); //Panel�� �ø���
		
		JPanel p2=new JPanel();
		p2.add(b3);p2.add(b4);
		p2.setBounds(300, 665, 485, 35);
		p2.setOpaque(false);
		add(p2);
	}

	@Override
	protected void paintComponent(Graphics g){
		g.drawImage(back1, 0, 0, getWidth(), getHeight(),this);
	}

	public static void main(String[] args){
		//		//��� ���� �ͱ��� �������� 3��
		//		JoinForm f=new JoinForm();
		//		JPanel p=new JoinForm();
		//		Object obj=new JoinForm();

	}
}
