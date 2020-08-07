
package com.sist.client;
//윈도우 =>JFrame

//윈도우와 관련된 클래스를 읽어온다

import javax.swing.*; // 윈도우관련 
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import com.sist.common.Function;

import java.awt.*; // Color,Layout  
import java.awt.event.*;// interface (버튼)처리 함수
/*
 *  재사용
 *    = 상속(is-a)	: 기존의 클래스를 변경해서 사용
 *    public class ClientMainFrame extends JFrame
 *    				===============
 *    				JFrame 기능을 전체 가져와서 수정하여 사용
 *    class A
 *    {`
 *    	O X W
 *    }
 *    class B extned A
 *    {
 *    	O X W
 *    }
 *    = 포함(has-a)	: 기존으 클래스를 변경없이 사용
 *    public class ClientMainFrame 
 *    {
 *    	JFrame f = new JFrame();
 *    
 *    }
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.StringTokenizer;

public class ClientMainFrame extends JFrame implements ActionListener, MouseListener, Runnable {
	/*
	 * ★ 1) 윈도우 크기 결정 -윈도우 크기 결정은 대부분 생성자에서 사용
	 */
	//JLabel title = new JLabel("오늘 뭐하지?", JLabel.CENTER); // JLabel.center는 가운데 정렬 시킨다는 소리다.
	MenuForm mf = new MenuForm();
	ChatForm cf = new ChatForm();
	ControllPanel cp;
	int curpage = 1;
	int totalpage = 16; // 페이지 16이였다가 4로 조정햇음
	Login login = new Login();
	JLabel label;

	
	// 네트워크 관련 프로그램
	Socket s; // 연결기계
	OutputStream out; // 서버로 요청값 전송 => 로그인,채팅 문자열, 종료....
	BufferedReader in; // 서버로 값을 받오는 클래스
	

	public ClientMainFrame() {
		/*
		 * 클래스에서 생성자 사용 => 선언이 아니라 구현할때 예) 데이터베이스 : 오라클 연결 네트워크 : 셋팅 => IP,PORT 웹 : 쿠키에서
		 * 값읽기 => 자동로그인
		 */
		cp = new ControllPanel(this); //새로운 창이 아니라 현재 실행중인 윈도우창을 전송
		
		String path = "C:\\javaDev\\logo2.png";
		label = new JLabel(new ImageIcon(path));
		label.setBounds(10,10,114,80);
		// 0 0 114 80
		// 0 10 114 80
		add(label);
		//title.setFont(new Font("함초롬돋움", Font.BOLD, 55)); // 궁서체 글씨 굵게 55사이즈
		//title.setOpaque(false); // 투명모드는 불투명모드를 바꿔줘야한다.
		//title.setBackground(Color.black); // 바탕색
		setLayout(null); // null주면 우리가 직접 layout설정
		//title.setBounds(10, 15, 1570, 70);
		// 추가 => add()
		//add(title);
		
		//logo=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\logo.png");
		
		//label = new JLabel((new ImageIcon(path)));
		//label.setBounds(0,0,getWidth(),getHeight());
		//add(label);
		// 메뉴배치
		mf.setBounds(10, 120, 100, 400);
		mf.setOpaque(false);
		add(mf);
		// 채팅룸
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// 출력화면
		cp.setBounds(115, 120, 1465, 650);
		//540-650
		
		add(cp);
		setSize(1600, 1000);
		//setVisible(true); 네트워크때문에  일단 주석 
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		mf.b4.addActionListener(this);
		mf.b5.addActionListener(this);

		cp.ff.b1.addActionListener(this); // 이전
		cp.ff.b2.addActionListener(this); // 다음
		cp.ff.boyung_b1.addActionListener(this); // 보영 이전
		cp.ff.boyung_b2.addActionListener(this); // 보영 다음
		cp.ff.danbi_b1.addActionListener(this); // 단비 이전
		cp.ff.danbi_b2.addActionListener(this); // 단비 다음
		cp.ff.yunsu_b1.addActionListener(this); // 윤수 이전
		cp.ff.yunsu_b2.addActionListener(this); // 윤수 다음
		
		
		cp.df.b2.addActionListener(this);
		
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.tf.addActionListener(this); //검색할때 엔터 누르는 것도 actionlistener로 사용이 가능하다.
		
		//윤수 버튼 처리
		cp.ylf.b1.addActionListener(this);
		cp.ylf.b2.addActionListener(this);
		cp.ylf.b3.addActionListener(this);
		cp.ylf.b4.addActionListener(this);
		cp.ylf.b5.addActionListener(this);
		cp.ylf.b6.addActionListener(this);
		cp.ylf.tf.addActionListener(this);
		
		//단비햄 버튼 처리
		cp.dlf.b1.addActionListener(this);
		cp.dlf.b2.addActionListener(this);
		cp.dlf.b3.addActionListener(this);
		cp.dlf.b4.addActionListener(this);
		cp.dlf.b5.addActionListener(this);
		cp.dlf.tf.addActionListener(this);
		//보영쓰 버튼 처리
		cp.blf.b1.addActionListener(this);
		cp.blf.b2.addActionListener(this);
		cp.blf.b3.addActionListener(this);
		cp.blf.b4.addActionListener(this);
		cp.blf.b5.addActionListener(this);
		cp.blf.b6.addActionListener(this);
		cp.blf.tf.addActionListener(this);
		// 로그인 처리
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);

		// 종료
		mf.b7.addActionListener(this);

		// 채팅
		cf.tf.addActionListener(this);
		/*
		for(int i=0;i<4;i++)
		{
			cp.ff.mc[i].addMouseListener(this);
		}
		*/
	}
//	public void mouselistnener(int curpage)
//	{
//		for(int i=0;i<10;i++)
//		{
//		cp.ff.mc[i].addMouseListener(this);
//		}
//	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel"); // win
		new ClientMainFrame();
	}

	// 화면 이미지 축소
	public static Image getImage(ImageIcon ii, int w, int h) {
		Image dimg = ii.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
		return dimg;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == mf.b1) {
			cp.card.show(cp, "FF"); // 버튼눌렀을때 card 레이아웃에 보여지는 패널을 바꾼다는 소리임 *중요
		} else if (e.getSource() == mf.b2) {			
			cp.card.show(cp, "LF");
		} else if (e.getSource() == mf.b3) {
			cp.card.show(cp,"BLF");
			System.out.println("보영버튼 클릭");
		}else if (e.getSource() == mf.b4) {
			cp.card.show(cp,"YLF");
			System.out.println("윤수버튼 클릭");
		}else if (e.getSource() == mf.b5) {
			cp.card.show(cp,"DLF");
		}
		else if (e.getSource() == cp.df.b2){
			cp.card.show(cp,"FF");
		}
		else if (e.getSource() == mf.b5){
			cp.card.show(cp,"NF");
		}else if (e.getSource() == cp.ff.b1) {
			//이전버튼
			if(curpage >1)
			{
				curpage--;
				cp.ff.p.removeAll();
				cp.ff.CampingPrint(curpage);
				cp.ff.repaint();	//
				cp.ff.p.validate(); // 패널의 원래 기능으로 재배치.
				//mouselistnener(curpage);
			}
		} else if (e.getSource() == cp.ff.b2) {
			//다음 버튼
			if(curpage < totalpage)
			{
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.CampingPrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
				//mouselistnener(curpage);
				
				cp.df.b2.addActionListener(this);
				cp.df.b1.addActionListener(this);
			}
		} 
		//윤수 사진 넘기기  
		else if (e.getSource() == cp.ff.yunsu_b1) {
			//이전버튼
			if(curpage > 1)
			{
				curpage--;
				cp.ff.yp.removeAll();
				cp.ff.yunsuPrint(curpage);
				cp.ff.repaint();	//
				cp.ff.yp.validate(); // 패널의 원래 기능으로 재배치.
				//mouselistnener(curpage);
			}
		} else if (e.getSource() == cp.ff.yunsu_b2) {
			//다음 버튼
			if(curpage < totalpage)
			{
				curpage++;
				cp.ff.yp.removeAll();
				cp.ff.yunsuPrint(curpage);
				cp.ff.repaint();
				cp.ff.yp.validate();
				//mouselistnener(curpage);
				
				//cp.df.b2.addActionListener(this);
				//cp.df.b1.addActionListener(this);
			}
		} 
		//보영 사진 넘기기
		else if (e.getSource() == cp.ff.boyung_b1) {
			//이전버튼
			if(curpage >1)
			{
				curpage--;
				cp.ff.bp.removeAll();
				cp.ff.boyungPrint(curpage);
				cp.ff.repaint();	//
				cp.ff.bp.validate(); // 패널의 원래 기능으로 재배치.
				//mouselistnener(curpage);
			}
		} else if (e.getSource() == cp.ff.boyung_b2) {
			//다음 버튼
			if(curpage < totalpage)
			{
				curpage++;
				cp.ff.bp.removeAll();
				cp.ff.boyungPrint(curpage);
				cp.ff.repaint();
				cp.ff.bp.validate();
				//mouselistnener(curpage);
				
				//cp.df.b2.addActionListener(this);
				//cp.df.b1.addActionListener(this);
			}
		} 
		//단비 사진 넘기기
		else if (e.getSource() == cp.ff.danbi_b1) {
			//이전버튼
			if(curpage >1)
			{
				curpage--;
				cp.ff.dp.removeAll();
				cp.ff.danbiPrint(curpage);
				cp.ff.repaint();	//
				cp.ff.dp.validate(); // 패널의 원래 기능으로 재배치.
				//mouselistnener(curpage);
			}
		} else if (e.getSource() == cp.ff.danbi_b2) {
			//다음 버튼
			if(curpage < totalpage)
			{
				curpage++;
				cp.ff.dp.removeAll();
				cp.ff.danbiPrint(curpage);
				cp.ff.repaint();
				cp.ff.dp.validate();
				//mouselistnener(curpage);
				
				//cp.df.b2.addActionListener(this);
				//cp.df.b1.addActionListener(this);
			}
		} 
		else if(e.getSource()==cp.lf.b1)
		{
			cp.lf.CampingAllData(1);
		}
		else if(e.getSource()==cp.lf.b2)
		{
			cp.lf.CampingAllData(2);
		}
		else if(e.getSource()==cp.lf.b3)
		{
			System.out.println("b3버튼 클릭");
			cp.lf.CampingAllData(3);
		}
		else if(e.getSource()==cp.lf.b4)
		{
			cp.lf.CampingAllData(4);
		}
		else if(e.getSource()==cp.lf.b5)
		{
			cp.lf.CampingAllData(5);
		}
		//윤수꺼 리스트 폼임 기억하자
		else if(e.getSource() == cp.ylf.b1)
		{
			cp.ylf.movieAllData(1);
		}
		else if(e.getSource() == cp.ylf.b2)
		{
			cp.ylf.movieAllData(2);
		}
		else if(e.getSource() == cp.ylf.b3)
		{
			cp.ylf.movieAllData(3);
		}
		else if(e.getSource() == cp.ylf.b4)
		{
			cp.ylf.movieAllData(4);
		}	
		else if(e.getSource() == cp.ylf.b5)
		{
			cp.ylf.movieAllData(5);
		}
		//단비햄꺼 리스트 폼임!!
		else if(e.getSource() == cp.dlf.b1)
		{
			cp.dlf.ClassAllData(1);
		}
		else if(e.getSource() == cp.dlf.b2)
		{
			cp.dlf.ClassAllData(2);
		}
		else if(e.getSource() == cp.dlf.b3)
		{
			cp.dlf.ClassAllData(3);
		}
		else if(e.getSource() == cp.dlf.b4)
		{
			cp.dlf.ClassAllData(4);
		}
		//보영쓰 리스트 폼 #@!#%%^&*%$#
		else if(e.getSource() == cp.blf.b1)
		{
			cp.blf.movieAllData(1);
		}
		else if(e.getSource() == cp.blf.b2)
		{
			cp.blf.movieAllData(2);
		}
		else if(e.getSource() == cp.blf.b3)
		{
			cp.blf.movieAllData(3);
		}
		else if(e.getSource() == cp.blf.b4)
		{
			cp.blf.movieAllData(4);
		}
		else if(e.getSource() == cp.blf.b5)
		{
			cp.blf.movieAllData(5);
		}
	
			
			
		// 지승구 꺼 검색하면 나오는 부분
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf)
		{
			// 검색버튼을 눌렀거나 엔터를 쳤을때
			// 1.입력된 값 읽기
			String ss=cp.lf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this,"검색어를 입력하세요");
				cp.lf.tf.requestFocus();//커서 깜빡이 
				return; //메소드 종료
			}
			cp.lf.CampingFindData(ss);
		}
		
		// 윤수 꺼 검색하면 나오는 부분
		else if(e.getSource()==cp.ylf.b6 || e.getSource()==cp.ylf.tf)
		{
			// 검색버튼을 눌렀거나 엔터를 쳤을때
			// 1.입력된 값 읽기
			String ss=cp.ylf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this,"검색어를 입력하세요");
				cp.ylf.tf.requestFocus();//커서 깜빡이 
				return; //메소드 종료
			}
			cp.ylf.movieFindData(ss);
		}
		// 보영쓰 검색하면 나오는 부분
		else if(e.getSource()==cp.blf.b6 || e.getSource()==cp.blf.tf)
		{
			// 검색버튼을 눌렀거나 엔터를 쳤을때
			// 1.입력된 값 읽기
			String ss=cp.blf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this,"검색어를 입력하세요");
				cp.blf.tf.requestFocus();//커서 깜빡이 
				return; //메소드 종료
			}
			cp.blf.movieFindData(ss);
		}
		
		//단비햄 검색하면 나오는 부분
		else if(e.getSource()==cp.dlf.b5 || e.getSource()==cp.dlf.tf)
		{
			// 검색버튼을 눌렀거나 엔터를 쳤을때
			// 1.입력된 값 읽기
			String ss=cp.dlf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this,"검색어를 입력하세요");
				cp.dlf.tf.requestFocus();//커서 깜빡이 
				return; //메소드 종료
			}
			cp.dlf.classFindData(ss);
		}
		///////////////////
		
		else if(e.getSource()==login.b1)
		{
			String id=login.tf1.getText();
			if(id.length()<1)// ID가 입력하지 않을 경우
			{
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, "대화명을 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected())
				sex="남자";
			else
				sex="여자";
			
			// 서버로 입력받은 데이터 전송 
			try
			{
				// 연결  => 서버에 대한 정보를 가지고 있다 
				s=new Socket("211.238.142.184",3355);
				// 송수신 위치 확인
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
				
				// 로그인 요청 (서버로 전송되는 부분)
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex){}
			    
			    //서버에서 전송하는 데이터를 읽어서 출력 
			    new Thread(this).start();
			    // run()의 위치 확인 ==> 자신의 클래스안에 존재 => (this)
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cf.tf)// 채팅 
		{
			String color=cf.box.getSelectedItem().toString();
			String msg=cf.tf.getText();
			if(msg.length()<1)
				return;
			// 데이터를 서버로 전송 
			try
			{
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex){}
			
			    cf.tf.setText("");
		}
		else if(e.getSource()==mf.b7)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++)
		{
			if(e.getSource()==cp.ff.mc[i])
			{
				System.out.println("클릭");
				if(e.getClickCount()==2) //더블클릭을 발생했을시에
				{
					int a=(i+1)+((curpage*4)-4);
					//JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.detailPrint(a);
					cp.card.show(cp, "DF");
					break;
				}
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
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 서버에서 들어오는 데이터를 받아서 처리 
		try
		{
			while(true)
			{
				String msg=in.readLine();
				System.out.println("server=>"+msg);
				StringTokenizer st=
						  new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				   case Function.MYLOG:
				   {
					   setTitle(st.nextToken());
					   login.setVisible(false);// 로그인창
					   setVisible(true);// 영화창 (Main) 
				   }
				   break;
				   case Function.LOGIN:
				   {
					   // 테이블에 출력 
					   String[] data= {
						  st.nextToken(), // id
						  st.nextToken(), // name
						  st.nextToken() // sex
					   };
					   cf.model.addRow(data);
				   }
				   break;
				   case Function.CHAT:
				   {
					     initStyle();
					     append(st.nextToken(),st.nextToken());
				   }
				   break;
				   case Function.EXIT:
				   {
					   String id=st.nextToken();
					   for(int i=0;i<cf.model.getRowCount();i++)
					   {
						   String mid=cf.model.getValueAt(i,0).toString();
						   if(id.equals(mid))
						   {
							   cf.model.removeRow(i);
							   break;
						   }
					   }
				   }
				   break;
				   case Function.MYEXIT:
				   {
					   dispose();// 윈도우 메모리 해제 
					   System.exit(0);// 프로그램 종료 
				   }
				   break;
				}
			}
		}catch(Exception ex) {}
	}
    public void initStyle()
    {
    	Style def=StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
    	Style red=cf.ta.addStyle("red", def);
    	StyleConstants.setForeground(red, Color.red);
    	
    	Style blue=cf.ta.addStyle("blue", def);
    	StyleConstants.setForeground(blue, Color.blue);
    	
    	Style green=cf.ta.addStyle("green", def);
    	StyleConstants.setForeground(green, Color.green);
    	
    	Style yellow=cf.ta.addStyle("yellow", def);
    	StyleConstants.setForeground(yellow, Color.yellow);
    	
    	Style gray=cf.ta.addStyle("gray", def);
    	StyleConstants.setForeground(gray, Color.gray);
    	
    	Style cyan=cf.ta.addStyle("cyan", def);
    	StyleConstants.setForeground(cyan, Color.cyan);
    }
    public void append(String msg,String color)
    {
    	try
    	{
    		Document doc=cf.ta.getDocument();
    		doc.insertString(doc.getLength(), msg+"\n", cf.ta.getStyle(color));
    	}catch(Exception ex) {}
    }
}


