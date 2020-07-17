package com.sist.client;
/*	프로젝트: 네트워크 흐름파악
 * 	1.로그인=>서버에 저장
 * 	2.회원가입
 * =================
 * 	3.목록 출력
 *  4.상세보기
 *  5.예매,장바구니
 *  6.마이페이지,관리자페이지
 *  7.채팅
 */
import javax.swing.*;
import java.awt.*;
public class Login extends JPanel{
	//스킨
	private Image back1;
	private JLabel la1,la2; //id,pw
	//Login
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	//MainForm
	public Login() {
		//이미지 정보읽기
		back1=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back1.jpg");
		//직접 배치
		setLayout(null);
		la1=new JLabel("아이디",JLabel.RIGHT);
		la1.setBounds(745, 775, 80, 30);
		tf=new JTextField();
		tf.setBounds(830, 775, 150, 30);
		add(la1); add(tf);
		
		la2=new JLabel("비밀번호",JLabel.RIGHT);
		la2.setBounds(745, 810, 80, 30);
		pf=new JPasswordField();
		pf.setBounds(830, 810, 150, 30);
		add(la2); add(pf);
		
		b1=new JButton("LOGIN");
		b2=new JButton("JOIN");
		JPanel p=new JPanel();//패널배치, 묶어서 가운데 한번에 배치
		p.add(b1); p.add(b2);
		p.setOpaque(false);//투명모드
		p.setBounds(745,850,235,35);
		add(p);
	}
	@Override
	protected void paintComponent(Graphics g){
		g.drawImage(back1,0,0,getWidth(),getHeight(),this);
	}
	
}
