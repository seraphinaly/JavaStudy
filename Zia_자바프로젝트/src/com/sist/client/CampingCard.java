package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.net.*;

public class CampingCard extends JPanel{ //JLabel.setIcon (img) Jpanel에는 Toolkit으로 사용해야한다 
	String title,poster;
	Image img;
	//URL url;
	public CampingCard(String title,String poster)
	{
		this.title=title;
		this.poster=poster;
		try {
			//url = new URL(poster);
			img=Toolkit.getDefaultToolkit().getImage(new URL(poster)); 
		}catch (Exception e) {}
		setToolTipText(title); //ToolKitText 란  그림에 커서 가져다 놓으면 창을띄어주는거
	}	
	public void paint(Graphics g)//그림을 그리는 부분
	{	
		g.drawImage(img, 0, 0, getWidth(),getHeight(), this);
	}
}
