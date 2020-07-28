package com.sist.client;

//윈도우와 관련된 클래스 불러옴
import javax.swing.*; //JButton 등
import java.awt.*; //Color, Layout
import java.awt.event.*; //interface(버튼 처리)
//윈도우 => JFrame

public class ClientMainFrame extends JFrame implements ActionListener,MouseListener{
	JLabel title=new JLabel("영화 예매 & 추천 프로그램", JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControlPanel cp;
	int curpage=1;
	int totalpage=16;

	//윈도우 크기 결정 → 생성자(선언이 아닌 구현 용도)
	public ClientMainFrame(){
		cp=new ControlPanel(this); //현재 실행중(this)인 윈도우창 전송
		setLayout(null); //JFrame(BorderLayout)사용자 정의로 배치=>null
		title.setFont(new Font("함초롬돋움", Font.BOLD, 45));
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
		cp.setBounds(115, 120, 1465, 635);
		add(cp);

		setSize(1600, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //x버튼 클릭시 종료

		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);

		cp.ff.b1.addActionListener(this);//이전
		cp.ff.b2.addActionListener(this);//다음
		
		cp.df.b2.addActionListener(this);//목록

		for(int i=0;i<10;i++) {
			cp.ff.mc[i].addMouseListener(this);
		}
	}

	public static void main(String[] args) throws Exception{
		//생성자는 호출시 반드시 new
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new ClientMainFrame();
	}

	//라벨크기에 맞춰서 이미지를 딱 맞게 만들어줌
	public static Image getImage(ImageIcon ii, int w, int h){
		Image dimg=ii.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
		return dimg;
	}

	@Override //버튼처리
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==mf.b1){
			cp.card.show(cp, "FF");
		} else if(e.getSource()==mf.b2){
			cp.card.show(cp, "LF");
		} else if(e.getSource()==cp.df.b2){
				cp.card.show(cp, "FF");
		} else if(e.getSource()==cp.ff.b1){ //이전버튼
			if(curpage>1){
				curpage--;
				cp.ff.p.removeAll(); //JPanel 모든기능 삭제
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate(); //JPanel 원래기능 재배치
			}
		} else if(e.getSource()==cp.ff.b2){ //다음버튼
			if(curpage<totalpage){
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}

	}

	@Override
	public void mouseClicked(MouseEvent e){
		for(int i=0;i<10;i++) {
			if(e.getSource()==cp.ff.mc[i]) { //ControlPanel >> MovieForm
				if(e.getClickCount()==2) {
					int a=(i+1)+((curpage*10)-10);
					//JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.detailPrint(a);
					cp.card.show(cp, "DF");//화면 전환
					break;
				}
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e){
		// TODO Auto-generated method stub
		
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
}
