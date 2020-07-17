package com.sist.inter;
//클래스 여러 개를 묶어서 관리 가능: 인터페이스의 목적
public class MainClass3{

	public static void main(String[] args){
		Container c=new Container();
		Connection conn=c.getBean("oracle");
		conn.connection();
		
		conn=c.getBean("mssql");
		conn.connection();

	}

}
