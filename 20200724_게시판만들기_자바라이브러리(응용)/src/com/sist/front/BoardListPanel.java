package com.sist.front;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class BoardListPanel extends JPanel{
	JButton b;
	//MV구조(데이터와 디자인 관리 따로)
	JTable table;//모양 관리=>View
	DefaultTableModel model;//데이터 관리=>수정,추가,출력 =>Model
	TableColumn column;

	public BoardListPanel(){
		b=new JButton("새글");
		String[] col= { "번호", "제목", "이름", "작성일", "조회수" };
		String[][] row=new String[0][5];
		//익명의 클래스: 상속없이 재정의 가능
		model=new DefaultTableModel(row,col){
			public boolean isCellEditable(int r, int c){
				return false;
			}
		}; 
		table=new JTable(model);
		//테이블 색 변경
		table.getTableHeader().setBackground(Color.orange);
		//table.setShowVerticalLines(false);
		table.setShowGrid(false);
		table.setRowHeight(35);
		table.setSelectionForeground(Color.white); //바탕색 바꾸기
		//테이블 제목 고정
		table.getTableHeader().setReorderingAllowed(false);
		JScrollPane js=new JScrollPane(table);
		js.getViewport().setBackground(Color.white);
		//배치
		setLayout(null);
		b.setBounds(10, 15, 100, 30);
		js.setBounds(10, 50, 600, 380);
		add(b); add(js);
		
		for(int i=0;i<5;i++) {
			column=table.getColumnModel().getColumn(i);
			DefaultTableCellRenderer render=new DefaultTableCellRenderer(); //정렬
			if(i==0) {
				column.setPreferredWidth(30);
				render.setHorizontalAlignment(JLabel.CENTER);
			}
			else if(i==1) {
					column.setPreferredWidth(400);
					render.setHorizontalAlignment(JLabel.LEFT);
			}
			else if(i==2) {
				column.setPreferredWidth(60);
				render.setHorizontalAlignment(JLabel.CENTER);
			}
			else if(i==3) {
				column.setPreferredWidth(80);
				render.setHorizontalAlignment(JLabel.CENTER);
			}
			else if(i==4) {
				column.setPreferredWidth(40);
				render.setHorizontalAlignment(JLabel.CENTER);
			}
			column.setCellRenderer(render);
		}
//		//출력
//		String[] data= {"1","ArrayList 연습중","이정후","2020-07-24","0"};
//		model.addRow(data);
	}
}
