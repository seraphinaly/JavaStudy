package com.sist.client;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.sist.data.BaseballManager;
import com.sist.data.BaseballVO;
import com.sist.data.CampingManager;
import com.sist.data.CampingVO;
import com.sist.data.ClassManager;
import com.sist.data.ClassVO;
import com.sist.data.MovieManager;
import com.sist.data.MovieVO;

/*
 *  메인화면에서 사진 좌우버튼클릭으로 볼 수 있는 부분 
 */
public class MainHomeForm extends JPanel {
	
	JButton b1, b2;
	JButton yunsu_b1,yunsu_b2;
	JButton danbi_b1,danbi_b2;
	JButton boyung_b1,boyung_b2;
	
	JPanel p = new JPanel();
	JPanel Seunggu = new JPanel();
	//JTextPane Seunggu_name = new JTextPane();
	JLabel Seunggu_name = new JLabel();
	CampingCard[] mc = new CampingCard[4];
	
	JPanel yp = new JPanel();
	JPanel yunsu = new JPanel();
	JLabel yunsu_name = new JLabel();
	CampingCard[] yc = new  CampingCard[4];
	
	JPanel bp = new JPanel();
	JPanel boyung = new JPanel();
	JLabel boyung_name = new JLabel();
	CampingCard[] bc = new  CampingCard[4];
	
	JPanel dp = new JPanel();
	JPanel danbi = new JPanel();
	JLabel danbi_name = new JLabel();
	CampingCard[] dc = new  CampingCard[4];
	
	
	ClientMainFrame c;

	JLabel label;
	
	public MainHomeForm(ClientMainFrame c)  {
		//URL url = new URL("c:\\javaDev\\advertisement");

		
		//la.setIcon(new ImageIcon(getImage(new ImageIcon(url),200,350)));
		this.c = c;
		setLayout(null);
		b1 = new JButton("◀");
		b2 = new JButton("▶");
		yunsu_b1 = new JButton("◀");
		yunsu_b2 = new JButton("▶");
		boyung_b1 = new JButton("◀");
		boyung_b2 = new JButton("▶");
		danbi_b1 = new JButton("◀");
		danbi_b2 = new JButton("▶");
		
		Seunggu.setLayout(new BorderLayout());
		yunsu.setLayout(new BorderLayout());
		boyung.setLayout(new BorderLayout());
		danbi.setLayout(new BorderLayout());
		
		
		Seunggu_name.setText("오늘 자고가니? 글램핑 ");
		Seunggu_name.setFont(new Font("함초롬돋움", Font.BOLD, 15)); // 궁서체 글씨 굵게 55사이즈
		Seunggu_name.setOpaque(false);
		
		yunsu_name.setText("오늘 어디가니? 야구장");
		yunsu_name.setFont(new Font("함초롬돋움", Font.BOLD, 15)); // 궁서체 글씨 굵게 55사이즈
		yunsu_name.setOpaque(false);
		
		danbi_name.setText("오늘 뭐만들지? 핸드메이드");
		danbi_name.setFont(new Font("함초롬돋움", Font.BOLD, 15)); // 궁서체 글씨 굵게 55사이즈
		danbi_name.setOpaque(false);
		
		boyung_name.setText("오늘 뭐먹니? 맛집");
		boyung_name.setFont(new Font("함초롬돋움", Font.BOLD, 15)); // 궁서체 글씨 굵게 55사이즈
		boyung_name.setOpaque(false);
		
		p.setLayout(new GridLayout(1, 4, 5, 5));
		yp.setLayout(new GridLayout(1, 4, 5, 5));
		dp.setLayout(new GridLayout(1, 4, 5, 5));
		bp.setLayout(new GridLayout(1, 4, 5, 5));
		
		CampingPrint(1);
		yunsuPrint(1);
		danbiPrint(1);
		boyungPrint(1);
		
		Seunggu.add("North", Seunggu_name);
		Seunggu.add("West", b1);
		Seunggu.add("Center", p);
		Seunggu.add("East", b2);	
		Seunggu.setBounds(0, 0, 650, 200);
		
		yunsu.add("North", yunsu_name);
		yunsu.add("West", yunsu_b1);
		yunsu.add("Center", yp);
		yunsu.add("East", yunsu_b2);	
		yunsu.setBounds(660, 0, 650, 200);
		
		boyung.add("North", boyung_name);
		boyung.add("West", boyung_b1);
		boyung.add("Center", bp);
		boyung.add("East", boyung_b2);	
		boyung.setBounds(0, 220, 650, 200);
		
		danbi.add("North", danbi_name);
		danbi.add("West", danbi_b1);
		danbi.add("Center", dp);
		danbi.add("East", danbi_b2);	
		danbi.setBounds(660, 220, 650, 200);
		
		String path = "C:\\javaDev\\AD.gif";
		label = new JLabel(new ImageIcon(path));
		label.setBounds(0,430,1465,220);
		add(label);
		add(Seunggu);
		add(yunsu);
		add(boyung);
		add(danbi);
		
	}

	public void CampingPrint(int page) {
		CampingManager m = new CampingManager();
		ArrayList<CampingVO> list = m.CampingListData(page);//2개씩 출력으로 바꿔줘야함.
		int i = 0;
		for (CampingVO vo : list) {
			// MovieCard fc = new MovieCard(vo.getTitle(), vo.getPoster());
			mc[i] = new CampingCard(vo.getTitle(), vo.getPoster());
			p.add(mc[i]);
			mc[i].addMouseListener(c);
			i++;
		}

	}
	public void yunsuPrint(int page) {
		BaseballManager m = new BaseballManager();
		ArrayList<BaseballVO> list = m.baseballListData(page);//2개씩 출력으로 바꿔줘야함.
		int i = 0;
		for (BaseballVO vo : list) {
			// MovieCard fc = new MovieCard(vo.getTitle(), vo.getPoster());
			yc[i] = new CampingCard(vo.getTeamName(), vo.getPoster());
			yp.add(yc[i]);
			yc[i].addMouseListener(c);
			i++;
		}
	}
	public void boyungPrint(int page) {
		MovieManager m = new MovieManager();
		ArrayList<MovieVO> list = m.movieListData(page);//2개씩 출력으로 바꿔줘야함.
		int i = 0;
		for (MovieVO vo : list) {
			// MovieCard fc = new MovieCard(vo.getTitle(), vo.getPoster());
			bc[i] = new CampingCard(vo.getTitle(), vo.getPoster());
			bp.add(bc[i]);
			bc[i].addMouseListener(c);
			i++;
		}
	}
	public void danbiPrint(int page) {
		ClassManager m = new ClassManager();
		ArrayList<ClassVO> list = m.ClassListData(page);//2개씩 출력으로 바꿔줘야함.
		int i = 0;
		for (ClassVO vo : list) {
			// MovieCard fc = new MovieCard(vo.getTitle(), vo.getPoster());
			dc[i] = new CampingCard(vo.getTitle(), vo.getPoster());
			dp.add(dc[i]);
			dc[i].addMouseListener(c);
			i++;
		}
		
	}
}
