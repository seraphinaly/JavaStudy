package com.sist.dao;
import java.util.*;
import java.sql.*;
public class MusicDAO{
	//����(Socket ����)
	private Connection conn;
	//����Ŭ =>SQL����(��,����)
	private PreparedStatement ps; //BufferedReader,OutputStream ����
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	//@localhost:�ڱ� IP (211.238.142.179 �� cmd>>ipconfig)
	/* 	mno NUMBER(3),
	title VARCHAR2(300),
	singer VARCHAR2(100),
	album VARCHAR2(200),
	poster VARCHAR2(1000), 
	state CHAR(6), --����,���,�ϰ�
	idcrement NUMBER(3),
	key VARCHAR2(50) --������ Ű
	*/
	
	//����̹� ���=>�ѹ��� ����
//	private static MusicDAO dao;
	public MusicDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	//�̱��� ����: �޸� ������ �ϳ��� ����(DAO���� �ѹ��� ����, �޸� ���ϡ�)
	//VO ����(new):�Ϲ� �����Ͷ� �޸𸮸� ���� �������ԡ� static ���� �ȵ�
//	public static MusicDAO newInstance() {
//		if(dao==null) 
//			dao=new MusicDAO();
//			
//			return dao;
//	}
	
	//����
	public void getConnection(){
		try{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex){}
	}
	
	//����
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
	
	//==========��� �����ͺ��̽� �������(�ʼ�����)
	
	//������ �߰�(���)
	public void musicInsert(MusicVO vo) {
		try{
			getConnection();
			//String sql="INSERT INTO genie_music VALUES("+vo.getMno()+"','"+vo.getTitle()+"','"+ ""+vo.getSinger()+"','"+vo.getAlbum()+"','"+vo.getPoster()+"','"+vo.getState()+"','" +vo.getKey()+"')";
			
			String sql="INSERT INTO genie_music VALUES(?,?,?,?,?,?,?,?)";//? �ְ� ���߿� �� ä��
			ps=conn.prepareStatement(sql);
			//?�� ä���=>������ ���� ����!!
			ps.setInt(1,vo.getMno());
			ps.setString(2,vo.getTitle()); //����Ŭ���� �ڵ����� ' '������ ��
			ps.setString(3,vo.getSinger());
			ps.setString(4,vo.getAlbum());
			ps.setString(5,vo.getPoster());
			ps.setString(6,vo.getState());
			ps.setInt(7,vo.getIdcrement());
			ps.setString(8,vo.getKey());
			//����
			ps.executeUpdate();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}finally {
			disConnection();
		}
	}
}
