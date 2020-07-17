package com.sist.client;
//윈도우와 관련된 클래스 불러옴
import javax.swing.*; //JButton 등
import java.awt.*; //Color, Layout
import java.awt.event.*; //interface(버튼 처리)
//윈도우 => JFrame
public class ClientMainFrame extends JFrame implements ActionListener{
	JLabel title=new JLabel("레시피&맛집 추천 사이트",JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControlPanel cp=new ControlPanel();
	
	//윈도우 크기 결정 → 생성자(선언이 아닌 구현 용도)
	public ClientMainFrame() {	
		setLayout(null); //JFrame(BorderLayout)사용자 정의로 배치=>null
		title.setFont(new Font("함초롬돋움",Font.BOLD,45));
		title.setOpaque(false); //true:불투명
		//title.setBackground(Color.red);
		title.setBounds(10, 15, 1570, 100);
		add(title);//추가
		//메뉴 배치
		mf.setBounds(10, 120, 100, 300);
		add(mf);
		//채팅폼
		cf.setBounds(115, 760, 1460, 200);
		add(cf);
		//출력화면
		cp.setBounds(115, 120, 1465, 755);
		add(cp);
		
		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //x버튼 클릭시 종료
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
	}
	public static void main(String[] args)throws Exception{	
		//생성자는 호출시 반드시 new
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel"); 
		new ClientMainFrame();
	}
	@Override//버튼처리
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==mf.b1) {
			cp.card.show(cp,"DF");
		}else if(e.getSource()==mf.b2) {
			cp.card.show(cp,"LF");
		}
		
	}

	
}
