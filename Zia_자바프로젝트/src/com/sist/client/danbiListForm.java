package com.sist.client;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import com.sist.data.*;
import java.net.*;

public class danbiListForm extends JPanel implements MouseListener{


   // ������ ��õ��ǰ, �ǽð� ����, �α���ǰ, �ű���ǰ
   JButton b1, b2, b3, b4, b5;
   JTextField tf;
   JTable table;
   DefaultTableModel model;
   ClassDetailForm cdf=new ClassDetailForm();
   
   
   /*
    * ��� => �޼ҵ� ==> ������, �Ű�����
    * 
    */
   public danbiListForm()
   {
      setLayout(null); // FlowLayout <-default 
                   // Layout(null) -> ����� ��ġ
      b1 = new JButton("������ ��õ��ǰ");
      b2 = new JButton("�ǽð� ����");
      b3 = new JButton("�α���ǰ");
      b4 = new JButton("�ű���ǰ");
      b5 = new JButton("�˻�");
 
      tf = new JTextField(20); //TextField 20�����̳��� �Է��� �� �ְ� ����
      //������ ��ġ�ϱ� ���ؼ� �г�
      JPanel p = new JPanel();
      p.add(b1);
      p.add(b2);
      p.add(b3);
      p.add(b4);
      p.add(b5);
      p.add(tf);
      p.setBounds(10,25,900,35);
      add(p);
      
      
      String[] col= {"��ȣ"," ","��ǰ��","�۰�","����","�����"};
      Object[][] row=new Object[0][6];
      
      
      //DefaultTableModel => �������̵� �Ҷ� �޼ҵ尡 �ִ�(�͸��� Ŭ���� => ����Ŭ����)
      /*
       *    ���� Ŭ���� => ������, ��Ʈ��ũ
       *    =======
       *    class A
       *    {
       *       ClassB{
       *          //BŬ������ AŬ������ �ɹ�Ŭ����
       *       }
       *    }
       */
      model = new DefaultTableModel(row,col){
         //������ �Ұ���
         @Override
         public boolean isCellEditable(int row, int column) {
            // TODO Auto-generated method stub
            return false;
         }
         // �̹��� ÷��
         @Override
         public Class<?> getColumnClass(int columnIndex) {
            // TODO Auto-generated method stub
            return getValueAt(0,columnIndex).getClass();
         }
      };
      //ScrollPane ����� ���
      table = new JTable(model);
      table.setRowHeight(35);
      JScrollPane js = new JScrollPane(table);
      
      js.setBounds(10, 70, 700, 600);
      add(js);
      
      cdf.setBounds(715, 70, 800, 650);
      add(cdf);
      
      ClassAllData(1);
      cdf.detailPrint(1);
      
      table.addMouseListener(this);
   }
   public void ClassAllData(int cno)
   {
      //������ ������ ����
      ClassManager m = new ClassManager();
      ArrayList<ClassVO> list = m.classAllData(cno);
      
      //���̺� �ѹ� �����
      //���̺� ���� : �ѹ� ����ϰ�  �� ����ϸ� �߰��� �ٱ⶧���� �ʱ�ȭ�� �ʿ��ϴ�.
      for(int i=model.getRowCount()-1;i>=0;i--)
      {
         //��µ� ī��� getRowCount
         model.removeRow(i);
      }
      
      // ScrollPane�� ��µ� ������ ���
      /*
       *  java.io,java.net ==> CheckException => �ݵ�� ����ó�� 
       */
      for(ClassVO vo:list)
      {
         try
         {//URL | IO(inputOput)�� ������ ������ try catch �ؾ��Ѵ�.         
            URL url = new URL(vo.getPoster()); //http:, c:\\image
            Image img =ClientMainFrame.getImage(new ImageIcon(url) ,50,50); //�̹��� ��� (���̺� �ȿ� ������ �̹��� ���)
            Object[] data = {
            vo.getMno(),
            new ImageIcon(img), //ScrollPane���� �̹��� �߰��� 
            vo.getTitle(),
            vo.getName(),
            vo.getQt(),
            vo.getDelivery(),
            vo.getPoint(),
            vo.getScore(),
            vo.getReview()
         };
         model.addRow(data);
         }catch (Exception ex) {}
      }
   }
   public void classFindData(String ss)
   {
      //������ ������ ����
      ClassManager m = new ClassManager();
      ArrayList<ClassVO> list = m.ClassFindData(ss);
      
      //���̺� �ѹ� �����
      //���̺� ���� : �ѹ� ����ϰ�  �� ����ϸ� �߰��� �ٱ⶧���� �ʱ�ȭ�� �ʿ��ϴ�.
      for(int i=model.getRowCount()-1;i>=0;i--)
      {
         //��µ� ī��� getRowCount
         model.removeRow(i);
      }
      
      // ScrollPane�� ��µ� ������ ���
      /*
       *  java.io,java.net ==> CheckException => �ݵ�� ����ó�� 
       */
      for(ClassVO vo:list)
      {
         try
         {//URL | IO(inputOput)�� ������ ������ try catch �ؾ��Ѵ�.         
            URL url = new URL(vo.getPoster()); //http:, c:\\image
            Image img =ClientMainFrame.getImage(new ImageIcon(url) ,50,50); //�̹��� ��� (���̺� �ȿ� ������ �̹��� ���)
            Object[] data = {
            vo.getMno(),
            new ImageIcon(img), //ScrollPane���� �̹��� �߰��� 
            vo.getTitle(),
            vo.getName(),
            vo.getQt(),
            vo.getDelivery(),
            vo.getPoint(),
            vo.getScore(),
            vo.getReview()
         };
         model.addRow(data);
         }catch (Exception ex) {}
      }
   }
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==table) {
		if(e.getClickCount()==2) {
			int row=table.getSelectedRow();
			String mno=model.getValueAt(row, 0).toString();
			cdf.detailPrint(Integer.parseInt(mno));
		}
	}
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
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