package com.sist.client;

import java.awt.*;
import javax.swing.*;
import java.net.*; //URL
import com.sist.data.*;

public class ClassDetailForm extends JPanel{
	JLabel poster=new JLabel();
	JLabel la1=new JLabel();
	JLabel[] la=new JLabel[4];
	JTextPane tp=new JTextPane();
	JButton b1,b2;
	
	public ClassDetailForm() {
	setLayout(null);
	poster.setBounds(10,15,350,450);
	add(poster);
	
	la1.setBounds(365, 15, 500, 45);
	la1.setFont(new Font("함초롱돋음",Font.BOLD,30));
	add(la1);
	
	JPanel p=new JPanel();
	p.setLayout(new GridLayout(5,1,5,5));
	String[] str= {"작가","배송일","적립금","평점"};
	
	for(int i=0;i<4;i++) {
		la[i]=new JLabel(str[i]);
		la[i].setFont(new Font("함초롬돋움", Font.BOLD, 20));
		p.add(la[i]);
	}
	p.setBounds(365, 80, 500, 300);
	add(p);
	
	tp.setEditable(false);
	JScrollPane js=new JScrollPane(tp);
	js.setBounds(365, 430, 1000, 200);
	add(js);
	
	b1=new JButton("구매하기");
	b2=new JButton("목록");
	
	JPanel p2=new JPanel();
	b1.setBackground(Color.RED);
	b2.setBackground(Color.green);
	p2.add(b1);
	p2.add(b2);
	p2.setFont(new Font("함초롱돋음",Font.BOLD,20));
	p2.setBounds(365, 385, 200, 50);
	add(p2);
	
	setSize(900,670);
	
	}
	
	public void detailPrint(int mno) {
		ClassManager m=new ClassManager();
		ClassVO vo=m.ClassDetailData(mno);
		la1.setText(vo.getTitle());
		try {
			URL url=new URL(vo.getPoster());
			Image img=ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight());
			poster.setIcon(new ImageIcon(img));
		}catch(Exception ex) {}
		
		la[0].setText("작가:"+vo.getName());
		la[1].setText("배송일:"+vo.getDelivery());
		la[2].setText("적립금"+vo.getPoint());
		la[3].setText("평점:"+vo.getScore());
		tp.setText(vo.getReview());
	}
}
