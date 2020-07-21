package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class ControlPanel extends JPanel{ //윈도우창 위 위에는 패널만!
	CardLayout card=new CardLayout();
	ListForm lf=new ListForm();
	DetailForm df=new DetailForm();
	FoodCategoryForm ff=new FoodCategoryForm();
	public ControlPanel() {
		setLayout(card);
		add("FF",ff);
		add("LF",lf);
		add("DF",df);
	}
}
