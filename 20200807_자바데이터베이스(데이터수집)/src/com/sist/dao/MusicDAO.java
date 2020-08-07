package com.sist.dao;
import java.util.*;
import java.sql.*;
public class MusicDAO{
	//연결(Socket 포함)
	private Connection conn;
	//오라클 =>SQL전송(송,수신)
	private PreparedStatement ps; //BufferedReader,OutputStream 포함
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	//@localhost:자기 IP (211.238.142.179 → cmd>>ipconfig)
	/* 	mno NUMBER(3),
	title VARCHAR2(300),
	singer VARCHAR2(100),
	album VARCHAR2(200),
	poster VARCHAR2(1000), 
	state CHAR(6), --유지,상승,하강
	idcrement NUMBER(3),
	key VARCHAR2(50) --동영상 키
	*/
	
	//드라이버 등록=>한번만 실행
//	private static MusicDAO dao;
	public MusicDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	//싱글톤 패턴: 메모리 공간을 하나만 생성(DAO에서 한번만 연결, 메모리 부하↓)
	//VO 제외(new):일반 데이터라서 메모리를 따로 가져야함→ static 쓰면 안됨
//	public static MusicDAO newInstance() {
//		if(dao==null) 
//			dao=new MusicDAO();
//			
//			return dao;
//	}
	
	//연결
	public void getConnection(){
		try{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex){}
	}
	
	//해제
	public void disConnection(){
		try{
			if(ps!=null)
				ps.close();
			if(conn!=null)
				conn.close();
		}catch(Exception ex){}
	}

	public Connection getConn(){
		return conn;
	}

	public PreparedStatement getPs(){
		return ps;
	}
	
	//==========모든 데이터베이스 공통사항(필수조건)
	
	//데이터 추가(기능)
	public void musicInsert(MusicVO vo) {
		try{
			getConnection();
			//String sql="INSERT INTO genie_music VALUES("+vo.getMno()+"','"+vo.getTitle()+"','"+ ""+vo.getSinger()+"','"+vo.getAlbum()+"','"+vo.getPoster()+"','"+vo.getState()+"','" +vo.getKey()+"')";
			
			String sql="INSERT INTO genie_music VALUES(?,?,?,?,?,?,?,?)";//? 주고 나중에 값 채움
			ps=conn.prepareStatement(sql);
			//?값 채우기=>데이터 순서 유의!!
			ps.setInt(1,vo.getMno());
			ps.setString(2,vo.getTitle()); //오라클에서 자동으로 ' '입혀서 들어감
			ps.setString(3,vo.getSinger());
			ps.setString(4,vo.getAlbum());
			ps.setString(5,vo.getPoster());
			ps.setString(6,vo.getState());
			ps.setInt(7,vo.getIdcrement());
			ps.setString(8,vo.getKey());
			//실행
			ps.executeUpdate();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}finally {
			disConnection();
		}
	}
}
