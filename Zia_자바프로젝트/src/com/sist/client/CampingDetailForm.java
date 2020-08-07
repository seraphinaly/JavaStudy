package com.sist.client;
import java.awt.*;
import java.net.URL;

import javax.swing.*;

import com.sist.data.*;

import java.util.*;
/*
 * 
 */
public class CampingDetailForm extends JPanel{
	JLabel poster = new JLabel();
	JLabel la1 = new JLabel();
	JLabel[] la = new JLabel[6]; 
	JTextPane ta = new JTextPane(); //문장길이만큼 짤려서 내려간다.
	JButton b1,b2;
	
	public CampingDetailForm()
	{
		setLayout(null);
		poster.setBounds(10, 15, 350, 400);
		add(poster);

		la1.setBounds(365,15,500,45);
		la1.setFont(new Font("함초롬돋움", Font.BOLD, 35));

		add(la1);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(6,1,5,5));

		String[] str = {"위치","리뷰횟수","별점","가격","이벤트","상세위치"}; 
		for(int i=0;i<6;i++)
		{
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("함초롬돋움", Font.BOLD, 20));
			p.add(la[i]);
		}
		p.setBounds(365, 80, 500, 300);
		add(p);

		ta.setEditable(false); // 입력 수정 비활성화
		JScrollPane js = new JScrollPane(ta);
		js.setBounds(10,420,700,100);

		add(js);

		b1=new JButton("예매");
		b2=new JButton("목록");
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

		la[0].setText("위치:"+vo.getLocation());
		la[1].setText("리뷰횟수:"+vo.getReview());
		la[2].setText("별점:"+vo.getStar_value());
		la[3].setText("가격:"+vo.getPrice());
		la[4].setText("이벤트:"+vo.getEvent());
		la[5].setText("상세위치:"+vo.getDetail_location());
		ta.setText(vo.getBoss());


	}
}
