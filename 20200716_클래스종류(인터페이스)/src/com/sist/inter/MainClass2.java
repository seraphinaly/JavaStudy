package com.sist.inter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//���߻��
public class MainClass2 extends JFrame implements ActionListener,MouseListener,ItemListener{
	JButton b1;
	JTextField tf;
	JLabel la;
	JComboBox box;
	//�ʱ�ȭ=> �޸𸮿� ����(������)
	public MainClass2() {
		b1=new JButton("Ŭ��");
		tf=new JTextField();
		la=new JLabel(new ImageIcon("c:\\javaDev\\rocket.png"));
		box=new JComboBox();
		box.addItem("������");
		box.addItem("���ϼ�");
		box.addItem("�ں�ȣ");
		//JFrame => BorderLayout
		add("West",b1);
		add("Center",la);
		add("South",tf);
		add("North",box);
		//East���� 5�� ���⿡ ��ġ����
		
		//ȭ��ũ��
		setSize(600, 650);
		setVisible(true);
		
		//�̺�Ʈ ���
		//=>b1 Ŭ��: actionPerformed() ȣ��
		b1.addActionListener(this);//this:�ڽ�(MainClass2)
		tf.addActionListener(this);//�ٸ� Ŭ�������� �ҷ�����=>new ~
		la.addMouseListener(this);
		box.addItemListener(this);
	}
	
	public static void main(String[] args){
		new MainClass2();
	}

	@Override
	public void mouseClicked(MouseEvent e){
		if(e.getSource()==la) {
			if(e.getClickCount()==2) { //����Ŭ��
				JOptionPane.showMessageDialog(this, "�󼼺���� �̵�");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e){		
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

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1) {
			JOptionPane.showMessageDialog(this, "��ư Ŭ��!!!");
			//this:�� ������ ���� ����޶� (null �ָ� ������â �ۿ� ��)
		}
		else if(e.getSource()==tf) {
			String msg=tf.getText();
			JOptionPane.showMessageDialog(this, msg);
			//�ؽ�Ʈâ�� �Է��ϰ� Enterġ�� �� �޼����� �����=>ä��
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e){
		if(e.getSource()==box) {
			String name=(String)box.getSelectedItem();
			//Object ����ȯ �ʿ�
			JOptionPane.showMessageDialog(this, name);
		}
	}

}
