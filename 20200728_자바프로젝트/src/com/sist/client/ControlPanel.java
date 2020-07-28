package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class ControlPanel extends JPanel{ //������â �� ������ �гθ�!
	CardLayout card=new CardLayout();
	ListForm lf=new ListForm();
	DetailForm df=new DetailForm();
	MovieForm ff;
	ClientMainFrame c;
	public ControlPanel(ClientMainFrame c) {
		this.c=c;
		ff=new MovieForm(c);
		setLayout(card);
		add("FF",ff); //MovieForm
		add("DF",df); //DetailForm
		add("LF",lf); //ListForm
	}
}