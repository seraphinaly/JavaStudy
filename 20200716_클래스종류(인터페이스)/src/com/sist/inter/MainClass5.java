//���̺� �׸����

package com.sist.inter;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;

public class MainClass5 extends JFrame{
	JTable table; //���̺� ���
	DefaultTableModel model; //���̺� �� ������ ����=>MV
	public MainClass5() {
		String[] col={"","�̸�","����","�ּ�"}; //Ÿ��Ʋbar
		String[][] row=new String[0][4]; //�����Ͱ� ���� ��ġ
		
		model=new DefaultTableModel(row,col){
		//�͸��� Ŭ����:������ �ڿ��� ������(�������̵�)=>�� ����� �޾ƾ� �Ǵ� ���� �ƴ�
			@Override
			public boolean isCellEditable(int row, int column){
				return false;//����Ŭ�� ���� �� ���� �ȵǰ� ���Ƴ���=>Ŭ���� �̺�Ʈ �߻� ���ؼ�
			}

			@Override
			public Class<?> getColumnClass(int columnIndex){
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
			
		};
		//table�� ÷��
		table=new JTable(model);
		table.setRowHeight(100);
		JScrollPane js=new JScrollPane(table);
		
		//�����쿡 �߰�
		add("Center",js);
		setSize(350,450);
		
		//�̹��� ũ�� �ٲٱ�
//		 static Image getImage(ImageIcon ii,int w,int h)
//		    {
//		    	Image dimg = ii.getImage().getScaledInstance(w, h,
//		    	        Image.SCALE_SMOOTH);
//		    	return dimg;
//		    }
		 
		//������ �߰�
		Object[] data= {new ImageIcon("c:\\javaDev\\a.png"),"������","����","����"};
		model.addRow(data); //addRow �� �� ���پ� �߰�
		model.addRow(data); 
		model.addRow(data);
		setVisible(true);
	}
	public static void main(String[] args){
		//������ ȣ��
		new MainClass5();
	}

}
