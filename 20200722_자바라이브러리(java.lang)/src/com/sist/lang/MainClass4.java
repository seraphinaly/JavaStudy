package com.sist.lang;

//toString() => 클래스 객체를 문자열로 변환
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;

public class MainClass4 extends JFrame implements MouseListener{
	JTable table;
	DefaultTableModel model;

	public MainClass4(){
		String[] col= { "이름", "나이", "주소" };
		String[][] row=new String[0][3];

		model=new DefaultTableModel(row, col){
			//익명 클래스: 메소드 재정의 => 클릭시 편집 방지
			public boolean isCellEditable(int r, int c){
				return false;
			}
		};
		
		table=new JTable(model); //MV(model&view)
		JScrollPane js=new JScrollPane(table); //타이틀바 있으려면 반드시 필요
		
		add("Center",js);
		for(int i=0;i<10;i++) {
			String[] data= {"홍길동"+(i+1),"30","서울"};
			model.addRow(data);
		}
		
		setSize(350,400);
		setVisible(true);
		
		table.addMouseListener(this);
	}

	public static void main(String[] args){
		new MainClass4();
	}

	@Override
	public void mouseClicked(MouseEvent e){
		// TODO Auto-generated method stub
		if(e.getSource()==table) {
			if(e.getClickCount()==2) {//더블클릭
				int row=table.getSelectedRow();//선택한 줄이 몇 번인지 알려줌
				String name=model.getValueAt(row, 0).toString();
				//Object>>String, (String)붙여서 형변환 해도 됨
				String age=model.getValueAt(row, 1).toString();
				String addr=model.getValueAt(row, 2).toString();
				String data="이름: "+name+"\n"
							+"나이: "+age+"\n"
							+"주소: "+addr;
				JOptionPane.showMessageDialog(this, data);
				
				Object obj=true;
				boolean bCheck=(boolean)obj;
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e){
		// TODO Auto-generated method stub
		
	}
}
