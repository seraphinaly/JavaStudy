package com.sist.inter;
import java.util.*;
//인터페이스: 여러 개의 클래스를 묶어서 인터페이스로 관리
interface Connection{
	public void connection();
}

class 오라클 implements Connection{
	public void connection() {
		System.out.println("오라클 연결");
	}
}

class DB2 implements Connection{
	public void connection() {
		System.out.println("DB2 연결");
	}
}

class MSSQL implements Connection{
	public void connection() {
		System.out.println("MSSQL 연결");
	}
}

class MySQL implements Connection{
	public void connection() {
		System.out.println("MySQl 연결");
	}
}

public class Container{
	Map map=new HashMap();
	public Container() {
		map.put("oracle",new 오라클());
		map.put("db2",new DB2());
		map.put("mssql",new MSSQL());
		map.put("mysql",new MySQL());
	}
	public Connection getBean(String key) {
		return (Connection)map.get(key);
	}
}
