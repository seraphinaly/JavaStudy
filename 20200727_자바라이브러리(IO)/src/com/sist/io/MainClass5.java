package com.sist.io;
import java.util.*;
import java.io.*;
//���� ���ε�(���� copy)
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass5 extends JFrame implements ActionListener{
	JTextField tf=new JTextField(25);//����ũ�� ����=>():�ڵ�ũ�� 1
	JButton b=new JButton("���� ����");
	public MainClass5() {
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b);
		add("Center",p);
		setSize(450,250);
		setVisible(true);
		b.addActionListener(this);
	}
	public static void main(String[] args){
		//������ ȣ��
		new MainClass5();
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b) { //b��ư Ŭ����
			JFileChooser jc=new JFileChooser(); //���� ���� ��ȯ
			if(jc.showOpenDialog(this)==jc.APPROVE_OPTION) {
				tf.setText(jc.getSelectedFile().getPath());//������ ������ ��θ��� ������
				//���� ī��(���ε�)�ڡڡ�
				try {
					FileInputStream fis=new FileInputStream(tf.getText());
					FileOutputStream fos=new FileOutputStream("c:\\upload\\"
									+jc.getSelectedFile().getName());//���ϸ��� ����
					int i=0;
					byte[] buffer=new byte[1024];
					while((i=fis.read(buffer, 0, 1024))!=-1) {
						fos.write(buffer, 0, i);//i:���� ����Ʈ��
					}
					fis.close();
					fos.close();
					JOptionPane.showMessageDialog(this,"���� ���ε� �Ϸ�");
				}catch(Exception ex) {}
			}
		}
		
	}

}
