package com.sist.client;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import com.sist.data.*;
import javax.swing.*;
import javax.swing.table.*;
import java.net.*;
public class yunsuListForm extends JPanel implements MouseListener{
   JButton b1,b2,b3,b4,b5,b6;
   JTextField tf;
   JTable table;
   DefaultTableModel model;
   BaseballDetailForm mdf=new BaseballDetailForm();

   public yunsuListForm()
   {
	   setLayout(null);// FlowLayout => null 사용자 정의 배치
	   b1=new JButton("팀순위");
		b2=new JButton("다승순위");
		b3=new JButton("세이브순위");
		b4=new JButton("타율순위");
		b5=new JButton("타자WAR순위");
		b6=new JButton("검색");
	   tf=new JTextField(20);
	   JPanel p=new JPanel();
	   p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(tf);p.add(b6);
	   p.setBounds(10,25,2200,35);
	   add(p);
	   String[] col={"순위", "팀이름","경기수", "승", "패", "무", 
				"승률", "게임차", "연속", "출루율", "장타율", "최근 10경기"};
		Object[][] row=new Object[0][11];

	   
	   model=new DefaultTableModel(row,col) {
        // 편집이 불가능 
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
	        // 이미지 첨부 
//			@Override
//			public Class<?> getColumnClass(int columnIndex) {
//				// TODO Auto-generated method stub
//				return getValueAt(0, columnIndex).getClass();
//			}

//			@Override
//			public Class<?> getColumnClass(int columnIndex){
//				// TODO Auto-generated method stub
//				return getValueAt(0, columnIndex).getClass();
//			}
			
		   
	   };
	   
	   table=new JTable(model);
	   table.setRowHeight(50);
	   JScrollPane js=new JScrollPane(table);
	   
	   js.setBounds(10, 70, 750, 550);
	   add(js);
	   
	   mdf.setBounds(800, 100, 800, 650);
	   add(mdf);
	   movieAllData(1);
	   mdf.detailPrint(1);
	   
	   table.addMouseListener(this);
   }
   public void movieAllData(int cno)
   {
	   // 데이터 가지고 오기 
	   BaseballManager m=new BaseballManager();
	   ArrayList<BaseballVO> list=m.baseballAllData(cno);
	   
	   // 테이블 한번 지우기 
	   // 마지막부터 지운다 
	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }
	   
	   // 데이터 출력 
	   /*
	    *    java.io,java.net ==> CheckException => 반드시 예외처리
	    */
	   for(BaseballVO vo:list)
	   {
		  try
		  {
			   URL url=new URL(vo.getPoster());//http:,c:\\image
			   Image img=ClientMainFrame.getImage(new ImageIcon(url),
					   50, 50);
			   Object[] data={vo.getMno(), vo.getTeamName(), vo.getGameNo(),
						vo.getWin(), vo.getLose(), vo.getDraw(), vo.getWinRatio(), 
						vo.getGap(), vo.getContinuity(), vo.getOutBase(),
						vo.getLongHit(), vo.getCurrentTen()};
			   model.addRow(data);
		  }catch(Exception ex){ex.printStackTrace();}
	   }
   }
   
   public void movieFindData(String ss)
   {
	   // 데이터 가지고 오기 
	   BaseballManager m=new BaseballManager();
	   ArrayList<BaseballVO> list=m.baseballFindData(ss);
	   
	   // 테이블 한번 지우기 
	   // 마지막부터 지운다 
	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }
	   
	   // 데이터 출력 
	   /*
	    *    java.io,java.net ==> CheckException => 반드시 예외처리
	    */
	   for(BaseballVO vo:list)
	   {
		  try
		  {
			   URL url=new URL(vo.getPoster());//http:,c:\\image
			   Image img=ClientMainFrame.getImage(new ImageIcon(url),
					   50, 50);
			   Object[] data={vo.getMno(), new ImageIcon(img), vo.getTeamName(), 
						vo.getWin(), vo.getLose(), vo.getDraw(), vo.getWinRatio(), 
						vo.getGap(), vo.getContinuity(), vo.getOutBase(),
						vo.getLongHit(), vo.getCurrentTen()};
			   model.addRow(data);
		  }catch(Exception ex){ex.printStackTrace();}
	   }
   }
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==table) {
		if(e.getClickCount()==2) {
			int row=table.getSelectedRow();
			String mno=model.getValueAt(row, 0).toString();
			mdf.detailPrint(Integer.parseInt(mno));
		}
	}
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stubpackage com.sist.client;


	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
