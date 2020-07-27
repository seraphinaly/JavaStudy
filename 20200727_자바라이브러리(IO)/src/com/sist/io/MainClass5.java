package com.sist.io;
import java.util.*;
import java.io.*;
//파일 업로드(파일 copy)
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass5 extends JFrame implements ActionListener{
	JTextField tf=new JTextField(25);//글자크기 지정=>():자동크기 1
	JButton b=new JButton("파일 선택");
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
		//생성자 호출
		new MainClass5();
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b) { //b버튼 클릭시
			JFileChooser jc=new JFileChooser(); //파일 열기 소환
			if(jc.showOpenDialog(this)==jc.APPROVE_OPTION) {
				tf.setText(jc.getSelectedFile().getPath());//선택한 파일의 경로명을 가져옴
				//파일 카피(업로드)★★★
				try {
					FileInputStream fis=new FileInputStream(tf.getText());
					FileOutputStream fos=new FileOutputStream("c:\\upload\\"
									+jc.getSelectedFile().getName());//파일명을 저장
					int i=0;
					byte[] buffer=new byte[1024];
					while((i=fis.read(buffer, 0, 1024))!=-1) {
						fos.write(buffer, 0, i);//i:읽은 바이트수
					}
					fis.close();
					fos.close();
					JOptionPane.showMessageDialog(this,"파일 업로드 완료");
				}catch(Exception ex) {}
			}
		}
		
	}

}
