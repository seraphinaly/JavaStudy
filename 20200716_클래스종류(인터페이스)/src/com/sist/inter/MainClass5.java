//테이블에 그림출력

package com.sist.inter;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;

public class MainClass5 extends JFrame{
	JTable table; //테이블 모양
	DefaultTableModel model; //테이블 내 데이터 제어=>MV
	public MainClass5() {
		String[] col={"","이름","성별","주소"}; //타이틀bar
		String[][] row=new String[0][4]; //데이터가 들어가는 위치
		
		model=new DefaultTableModel(row,col){
		//익명의 클래스:생성자 뒤에서 재정의(오버라이딩)=>꼭 상속을 받아야 되는 것은 아님
			@Override
			public boolean isCellEditable(int row, int column){
				return false;//더블클릭 했을 때 편집 안되게 막아놓음=>클릭시 이벤트 발생 위해서
			}

			@Override
			public Class<?> getColumnClass(int columnIndex){
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			
		};
		//table에 첨부
		table=new JTable(model);
		table.setRowHeight(100);
		JScrollPane js=new JScrollPane(table);
		
		//윈도우에 추가
		add("Center",js);
		setSize(350,450);
		
		//이미지 크기 바꾸기
//		 static Image getImage(ImageIcon ii,int w,int h)
//		    {
//		    	Image dimg = ii.getImage().getScaledInstance(w, h,
//		    	        Image.SCALE_SMOOTH);
//		    	return dimg;
//		    }
		 
		//데이터 추가
		Object[] data= {new ImageIcon("c:\\javaDev\\a.png"),"이정후","남자","서울"};
		model.addRow(data); //addRow 할 때 한줄씩 추가
		model.addRow(data); 
		model.addRow(data);
		setVisible(true);
	}
	public static void main(String[] args){
		//생성자 호출
		new MainClass5();
	}

}
