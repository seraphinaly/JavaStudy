package com.sist.client;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;
import java.net.*; //URL

import com.sist.data.CampingManager;
import com.sist.data.CampingVO;

public class DetailForm extends JPanel {
	JLabel poster = new JLabel();
	JLabel la1 = new JLabel("",JLabel.CENTER);
	JLabel[] la = new JLabel[6]; 
	JTextPane ta = new JTextPane(); //������̸�ŭ ©���� ��������.
	JButton b1,b2;


	//���� ���� �������̵��� area 
	public DetailForm()
	{
		setLayout(null);
		poster.setBounds(10,15,350,450);
		add(poster);

		la1.setBounds(365,15,500,45);
		la1.setFont(new Font("����ü",Font.BOLD,30));

		add(la1);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(6,1,5,5));

		String[] str = {"��ġ","����Ƚ��","����","����","�̺�Ʈ","����ġ"}; 
		for(int i=0;i<6;i++)
		{
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("����ü",Font.BOLD,25));
			p.add(la[i]);
		}
		p.setBounds(365, 80, 500, 300);
		add(p);

		ta.setEditable(false); // �Է� ���� ��Ȱ��ȭ
		JScrollPane js = new JScrollPane(ta);
		js.setBounds(10,470,855,150);

		add(js);

		b1=new JButton("����");
		b2=new JButton("���");
		b1.setBackground(Color.red);
		b2.setBackground(Color.green);
		JPanel p2 =new JPanel();
		p2.add(b1);
		p2.add(b2);

		p2.setBounds(365,385,200,35);
		add(p2);
		
	}
	public void detailPrint(int mno)
	{
		CampingManager m = new CampingManager();
		CampingVO vo = m.CampingDetailData(mno);
		la1.setText(vo.getTitle());
		try {
			URL url = new URL(vo.getPoster());
			Image img = ClientMainFrame.getImage(new ImageIcon(url),poster.getWidth(),poster.getWidth());
			poster.setIcon(new ImageIcon(img));
		}catch (Exception e) {}

		la[0].setText("��ġ:"+vo.getLocation());
		la[1].setText("����Ƚ��:"+vo.getReview());
		la[2].setText("����:"+vo.getStar_value());
		la[3].setText("����:"+vo.getPrice());
		la[4].setText("�̺�Ʈ:"+vo.getEvent());
		la[5].setText("����ġ:"+vo.getDetail_location());
		ta.setText("����� �Ѹ���: "+vo.getBoss());
		//ta.setText(vo.getBoss());


	}
}
