package com.sist.client;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
public class ControllPanel extends JPanel{
	CardLayout card = new CardLayout();
	ListForm lf = new ListForm();
	yunsuListForm ylf = new yunsuListForm();
	boyungListForm blf = new boyungListForm();
	danbiListForm dlf = new danbiListForm();
	DetailForm df = new DetailForm();
	MainHomeForm ff;
	ClientMainFrame c;
	
	

	//NewsForm nf = new NewsForm();
	public ControllPanel(ClientMainFrame c) 
	{
		this.c =c;
		ff=new MainHomeForm(c);

		setLayout(card);
		add("FF",ff);
		add("DF",df);
		//add("NF",nf);
		add("LF",lf);
		add("YLF",ylf);
		add("BLF",blf);
		add("DLF",dlf);

		
	}
}
