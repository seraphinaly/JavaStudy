package com.sist.client;

import javax.swing.*;
import com.sist.data.MovieManager;
import com.sist.data.MovieVO;

import java.awt.*;
import java.net.*;//URL

public class DetailForm extends JPanel{
	JLabel poster=new JLabel();
	JLabel la1=new JLabel();
	JLabel[] la=new JLabel[7];
	JTextPane ta=new JTextPane();
	JButton b1,b2;
	public DetailForm(){
		setLayout(null);

		poster.setBounds(10, 15, 350, 450);
		add(poster);

		la1.setBounds(375, 15, 500, 45);
		la1.setFont(new Font("함초롬돋움", Font.BOLD, 30));
		add(la1);
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(7,1,5,5));
		String[] str= {"감독","출연","장르","등급","개봉일","평점","누적"};
		for(int i=0;i<7;i++) {
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("함초롬돋움", Font.BOLD, 20));
			p.add(la[i]);
		}
		p.setBounds(375, 80, 500, 300);
		add(p);
		
		ta.setEditable(false); //글상자 비활성화
		JScrollPane js=new JScrollPane(ta);
		js.setBounds(10, 470, 855, 150);
		add(js);
		
		b1=new JButton("예매");
		b2=new JButton("목록");
		b1.setBackground(Color.red);
		b2.setBackground(Color.green);
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.setBounds(375, 385, 200, 35);
		add(p2);
	}

	public void detailPrint(int mno){
		MovieManager m=new MovieManager();
		MovieVO vo=m.movieDetailData(mno);
		la1.setText(vo.getTitle());
		try{
			URL url=new URL(vo.getPoster());
			Image img=ClientMainFrame.getImage(new ImageIcon(url), 
									poster.getWidth(), poster.getHeight());
			poster.setIcon(new ImageIcon(img));
		} catch(Exception ex){}
		
		la[0].setText("감독: "+vo.getDirector());
		la[1].setText("출연: "+vo.getActor());
		la[2].setText("장르: "+vo.getGenre());
		la[3].setText("등급:"+vo.getGrade());
		la[4].setText("개봉:"+vo.getRegdate());
		la[5].setText("평점:"+vo.getScore());
		la[6].setText("누적:"+vo.getShowUser());
		ta.setText(vo.getStory());
	}
}
