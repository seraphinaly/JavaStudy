package com.sist.client;

import java.awt.*;
import java.net.URL;

import javax.swing.*;

import com.sist.data.BaseballManager;
import com.sist.data.BaseballVO;

import java.util.*;

public class BaseballDetailForm extends JPanel {
	JLabel poster = new JLabel();
	JLabel la1 = new JLabel();
	JLabel[] la = new JLabel[10];
	JTextPane ta = new JTextPane();
	JButton b1, b2;

	public BaseballDetailForm() {
		setLayout(null);
		poster.setBounds(10, 15, 350, 400);
		add(poster);
		la1.setBounds(365, 15, 500, 45);
		la1.setFont(new Font("���ʷҵ���", Font.BOLD, 30));
		add(la1);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(10,1,5,5));
		String[] str={"����", "��", "��", "��", "�·�", "������", "����",
						"�����", "��Ÿ��", "�ֱ� 10���"};
		for(int i=0;i<10;i++){
			la[i] = new JLabel(str[i]);
			la[i].setFont(new Font("���ʷҵ���", Font.BOLD, 20));
			p.add(la[i]);
		}
		p.setBounds(365, 80, 500, 300);
		add(p);

		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		js.setBounds(10, 420, 700, 130);
		add(js);

		b1 = new JButton("����");
		b2 = new JButton("���");
		b1.setBackground(Color.red);
		b2.setBackground(Color.green);
		JPanel p2 = new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.setBounds(365, 385, 200, 35);
		add(p2);
	}

	public void detailPrint(int mno) {
		BaseballManager m = new BaseballManager();
		BaseballVO vo=m.baseballDetailData(mno);
		la1.setText(vo.getTeamName());
		try {
			URL url = new URL(vo.getPoster());
			Image img = ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight());
			poster.setIcon(new ImageIcon(img));
		} catch (Exception ex) {
		}

		la[0].setText("����: "+vo.getGameNo());
		la[1].setText("��: "+vo.getWin());
		la[2].setText("��: "+vo.getLose());
		la[3].setText("��: "+vo.getDraw());
		la[4].setText("�·�: "+vo.getWinRatio());
		la[5].setText("������: "+vo.getGap());
		la[6].setText("����: "+vo.getContinuity());
		la[7].setText("�����: "+vo.getOutBase());
		la[8].setText("��Ÿ��: "+vo.getLongHit());
		la[9].setText("�ֱ� 10���: "+vo.getCurrentTen());
	//	ta.setText(vo.getStory());

	}

}
