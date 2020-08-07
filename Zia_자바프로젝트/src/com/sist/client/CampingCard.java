package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.net.*;

public class CampingCard extends JPanel{ //JLabel.setIcon (img) Jpanel���� Toolkit���� ����ؾ��Ѵ� 
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
		setToolTipText(title); //ToolKitText ��  �׸��� Ŀ�� ������ ������ â������ִ°�
	}	
	public void paint(Graphics g)//�׸��� �׸��� �κ�
	{	
		g.drawImage(img, 0, 0, getWidth(),getHeight(), this);
	}
}
