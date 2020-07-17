package com.sist.inter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//다중상속
public class MainClass2 extends JFrame implements ActionListener,MouseListener,ItemListener{
	JButton b1;
	JTextField tf;
	JLabel la;
	JComboBox box;
	//초기화=> 메모리에 저장(생성자)
	public MainClass2() {
		b1=new JButton("클릭");
		tf=new JTextField();
		la=new JLabel(new ImageIcon("c:\\javaDev\\rocket.png"));
		box=new JComboBox();
		box.addItem("이정후");
		box.addItem("김하성");
		box.addItem("박병호");
		//JFrame => BorderLayout
		add("West",b1);
		add("Center",la);
		add("South",tf);
		add("North",box);
		//East까지 5개 방향에 배치가능
		
		//화면크기
		setSize(600, 650);
		setVisible(true);
		
		//이벤트 등록
		//=>b1 클릭: actionPerformed() 호출
		b1.addActionListener(this);//this:자신(MainClass2)
		tf.addActionListener(this);//다른 클래스에서 불러오면=>new ~
		la.addMouseListener(this);
		box.addItemListener(this);
	}
	
	public static void main(String[] args){
		new MainClass2();
	}

	@Override
	public void mouseClicked(MouseEvent e){
		if(e.getSource()==la) {
			if(e.getClickCount()==2) { //더블클릭
				JOptionPane.showMessageDialog(this, "상세보기로 이동");
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
			JOptionPane.showMessageDialog(this, "버튼 클릭!!!");
			//this:내 윈도우 위에 띄워달라 (null 주면 윈도우창 밖에 뜸)
		}
		else if(e.getSource()==tf) {
			String msg=tf.getText();
			JOptionPane.showMessageDialog(this, msg);
			//텍스트창에 입력하고 Enter치면 그 메세지를 띄워라=>채팅
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e){
		if(e.getSource()==box) {
			String name=(String)box.getSelectedItem();
			//Object 형변환 필요
			JOptionPane.showMessageDialog(this, name);
		}
	}

}
