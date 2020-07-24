package com.sist.front;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import com.sist.back.*;//데이터 사용
import java.util.*;
//날짜 변환
import java.text.*;//simpleDateFormat으로 날짜표시 변경

public class BoardMainFrame extends JFrame implements ActionListener{
	
	BoardListPanel bp=new BoardListPanel();
	JTabbedPane tp=new JTabbedPane(); //탭 추가
	BoardInsertPanel bi=new BoardInsertPanel();
	//프로그램 연결=> ArrayList=>BoardManager
	BoardManager bm=new BoardManager();
	public BoardMainFrame(){
		tp.addTab("게시판 목록",bp);
		tp.addTab("글쓰기",bi);
		tp.setTabPlacement(tp.BOTTOM); //TOP,BOTTOM,LEFT,RIGHT
		add("Center",tp);
		setSize(640,480);
		setVisible(true);
		
		bp.b.addActionListener(this);//새글
		bi.b1.addActionListener(this);//글쓰기
		bi.b2.addActionListener(this);//취소
	}
	
	public static void main(String[] args){
		new BoardMainFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==bp.b) { //새 글 버튼 클릭
			//글쓰기 화면으로 이동
			tp.setSelectedIndex(1);
		}else if(e.getSource()==bi.b1) { //글쓰기
			//ArrayList에 저장
			//입력한 데이터 읽기
			String name=bi.tf1.getText();
			String subject=bi.tf2.getText();
			String content=bi.ta.getText();
			String pwd=String.valueOf(bi.pf.getPassword());
			//password는 char[]로
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			bm.insert(vo);//ArrayList에 추가
			//목록 추가=>똑같은 내용을 반복하게 됨(글쓰기,수정,삭제)=>메소드 사용 권장
			listPrint();
			//목록으로 이동
			tp.setSelectedIndex(0);
		}else if(e.getSource()==bi.b2) { //취소
			//목록으로 이동
			tp.setSelectedIndex(0);
		}

	}
	//시작,수정,삭제,추가 시 호출할 메소드
	public void listPrint(){
		//ArrayList받기
		ArrayList<BoardVO> list=bm.select();
		//테이블에 출력
		//테이블 지우기
		for(int i=bp.model.getRowCount()-1;i>=0;i--) { //맨마지막부터 0번이 될때까지 지워라
			bp.model.removeRow(i);
		}
		//날짜형식 지정
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//주의>> MM:월, mm:분
		//출력
		for(BoardVO vo:list) {
			String[] data={
					String.valueOf(vo.getName()),
					vo.getSubject(),
					vo.getName(),
					sdf.format(vo.getRegdate()),//.toString: class=>문자열
					String.valueOf(vo.getHit())
			};
			bp.model.addRow(data);
		}
	}
}