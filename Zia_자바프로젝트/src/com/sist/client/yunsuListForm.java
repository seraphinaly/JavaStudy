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
	   setLayout(null);// FlowLayout => null ����� ���� ��ġ
	   b1=new JButton("������");
		b2=new JButton("�ٽ¼���");
		b3=new JButton("���̺����");
		b4=new JButton("Ÿ������");
		b5=new JButton("Ÿ��WAR����");
		b6=new JButton("�˻�");
	   tf=new JTextField(20);
	   JPanel p=new JPanel();
	   p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(tf);p.add(b6);
	   p.setBounds(10,25,2200,35);
	   add(p);
	   String[] col={"����", "���̸�","����", "��", "��", "��", 
				"�·�", "������", "����", "�����", "��Ÿ��", "�ֱ� 10���"};
		Object[][] row=new Object[0][11];

	   
	   model=new DefaultTableModel(row,col) {
        // ������ �Ұ��� 
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
	        // �̹��� ÷�� 
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
	   // ������ ������ ���� 
	   BaseballManager m=new BaseballManager();
	   ArrayList<BaseballVO> list=m.baseballAllData(cno);
	   
	   // ���̺� �ѹ� ����� 
	   // ���������� ����� 
	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }
	   
	   // ������ ��� 
	   /*
	    *    java.io,java.net ==> CheckException => �ݵ�� ����ó��
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
	   // ������ ������ ���� 
	   BaseballManager m=new BaseballManager();
	   ArrayList<BaseballVO> list=m.baseballFindData(ss);
	   
	   // ���̺� �ѹ� ����� 
	   // ���������� ����� 
	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }
	   
	   // ������ ��� 
	   /*
	    *    java.io,java.net ==> CheckException => �ݵ�� ����ó��
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
