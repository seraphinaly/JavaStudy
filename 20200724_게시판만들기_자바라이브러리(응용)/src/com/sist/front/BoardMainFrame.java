package com.sist.front;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import com.sist.back.*;//������ ���
import java.util.*;
//��¥ ��ȯ
import java.text.*;//simpleDateFormat���� ��¥ǥ�� ����

public class BoardMainFrame extends JFrame implements ActionListener{
	
	BoardListPanel bp=new BoardListPanel();
	JTabbedPane tp=new JTabbedPane(); //�� �߰�
	BoardInsertPanel bi=new BoardInsertPanel();
	//���α׷� ����=> ArrayList=>BoardManager
	BoardManager bm=new BoardManager();
	public BoardMainFrame(){
		tp.addTab("�Խ��� ���",bp);
		tp.addTab("�۾���",bi);
		tp.setTabPlacement(tp.BOTTOM); //TOP,BOTTOM,LEFT,RIGHT
		add("Center",tp);
		setSize(640,480);
		setVisible(true);
		
		bp.b.addActionListener(this);//����
		bi.b1.addActionListener(this);//�۾���
		bi.b2.addActionListener(this);//���
	}
	
	public static void main(String[] args){
		new BoardMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==bp.b) { //�� �� ��ư Ŭ��
			//�۾��� ȭ������ �̵�
			tp.setSelectedIndex(1);
		}else if(e.getSource()==bi.b1) { //�۾���
			//ArrayList�� ����
			//�Է��� ������ �б�
			String name=bi.tf1.getText();
			String subject=bi.tf2.getText();
			String content=bi.ta.getText();
			String pwd=String.valueOf(bi.pf.getPassword());
			//password�� char[]��
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			bm.insert(vo);//ArrayList�� �߰�
			//��� �߰�=>�Ȱ��� ������ �ݺ��ϰ� ��(�۾���,����,����)=>�޼ҵ� ��� ����
			listPrint();
			//������� �̵�
			tp.setSelectedIndex(0);
		}else if(e.getSource()==bi.b2) { //���
			//������� �̵�
			tp.setSelectedIndex(0);
		}

	}
	//����,����,����,�߰� �� ȣ���� �޼ҵ�
	public void listPrint(){
		//ArrayList�ޱ�
		ArrayList<BoardVO> list=bm.select();
		//���̺� ���
		//���̺� �����
		for(int i=bp.model.getRowCount()-1;i>=0;i--) { //�Ǹ��������� 0���� �ɶ����� ������
			bp.model.removeRow(i);
		}
		//��¥���� ����
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//����>> MM:��, mm:��
		//���
		for(BoardVO vo:list) {
			String[] data={
					String.valueOf(vo.getName()),
					vo.getSubject(),
					vo.getName(),
					sdf.format(vo.getRegdate()),//.toString: class=>���ڿ�
					String.valueOf(vo.getHit())
			};
			bp.model.addRow(data);
		}
	}
}