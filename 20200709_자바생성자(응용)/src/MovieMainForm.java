import javax.swing.*; //윈도우 관련 클래스
import javax.swing.border.LineBorder;

import javafx.scene.effect.Lighting;

import java.awt.*; //레이아웃(화면 배치)
import java.awt.event.*; //버튼 누르기,텍스트에 엔터=>행위(이벤트)
import java.net.URL;
//자바에서 지원하는 윈도우의 모든 기능을 사용=>상속:extends JFrame(윈도우)
//자바에서 상속은 한 개만 가능(단일 상속)
//인터페이스:implements       //상속
public class MovieMainForm extends JFrame implements ActionListener, MouseListener{
//포함 클래스=>변경불가(훨씬 많음, 상속은 하나밖에 못 받기 때문)
	JMenuBar bar=new JMenuBar();
	JMenuItem home=new JMenuItem("Home");
	JMenuItem find=new JMenuItem("찾기");
	JMenuItem exit=new JMenuItem("종료");

	CardLayout card=new CardLayout();//화면 전환 가능(요청한 화면을 제일 위에 쌓음)
	MovieList ml=new MovieList();
	MovieDetail md=new MovieDetail();

	MovieFind mf=new MovieFind();

	//실행 => 윈도우 보여준다 => 생성자
	int curpage=1;
	int totalpage=194;

	//명시적 초기화
	MovieMainForm(){

		//메뉴 설정
		JMenu menu=new JMenu("메뉴");
		menu.add(home);
		menu.add(find);
		menu.addSeparator();//구분선
		menu.add(exit);
		bar.add(menu);

		//윈도우에 설정
		setJMenuBar(bar);
		//레이아웃 설정
		setLayout(card);
		add("ML", ml);
		add("MD", md);
		add("MF", mf);

		//윈도우 크기 결정
		setSize(1300, 1000);
		//윈도우 보여준다
		setVisible(true);

		home.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);

		ml.b1.addActionListener(this);//movie list 이전버튼
		ml.b2.addActionListener(this);//다음버튼

		moviePrint(1);

		for(int i=0; i<2; i++){
			for(int j=0; j<5; j++){
				ml.movie[i][j].addMouseListener(this);
			}
		}
	}

	void moviePrint(int page){
		MovieVO[] movies=MovieManager.movieListData(page);
		int k=0;
		for(MovieVO vo : movies){
			try{
				//포스터 읽기
				URL url=new URL(vo.poster);
				Image img=getImage(new ImageIcon(url), ml.movie[0][0].getWidth(), ml.movie[0][0].getHeight());
				ml.movie[k/5][k%5].setIcon(new ImageIcon(img));
				k++;
			} catch(Exception ex){
			}
		}
		ml.pLa.setText(curpage+" page / "+totalpage+" pages");
	}

	static Image getImage(ImageIcon ii, int w, int h){
		Image dimg=ii.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
		return dimg;
	}

	public static void main(String[] args) throws Exception{
		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		new MovieMainForm();//생성자는 반드시 new를 붙여야함
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==home){
			card.show(getContentPane(), "ML");
		} else if(e.getSource()==find){
			card.show(getContentPane(), "MF");
		} else if(e.getSource()==exit){
			System.exit(0);
		} else if(e.getSource()==ml.b1){
			if(curpage>1){
				curpage--;
				moviePrint(curpage);
			}
		} else if(e.getSource()==ml.b2){
			if(curpage<totalpage){
				curpage++;
				moviePrint(curpage);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e){
		// 클릭

	}

	@Override
	public void mousePressed(MouseEvent e){
		// 누른 상태에서 왔다갔다

	}

	@Override
	public void mouseReleased(MouseEvent e){
		// 눌렀다 놨을때

	}

	@Override
	public void mouseEntered(MouseEvent e){
		// 위에 올려놨을때, mouseover, 흰색으로 테두리생김
		for(int i=0; i<2; i++){
			for(int j=0; j<5; j++){
				if(e.getSource()==ml.movie[i][j]){
					LineBorder line=new LineBorder(Color.white, 5);
					ml.movie[i][j].setBorder(line);
				}
			}
		}
	}

	@Override
	public void mouseExited(MouseEvent e){
		// 원상복구, 마우스 내리면 테두리 없어짐
		for(int i=0; i<2; i++){
			for(int j=0; j<5; j++){
				ml.movie[i][j].setBorder(null);
			}
		}
	}

}
