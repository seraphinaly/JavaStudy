//20200806_자바데이터베이스 에서 만든 라이브러리를 로드해서 사용
//buildpath에서 db.jar 선택!
package com.sist.dao;
import java.util.*;
import java.sql.*;
public class MyDAO{
	EmpDAO dao;
	public MyDAO() {
		dao=EmpDAO.newInstance();	
	}
	public void empAllData() {
		dao.getConnection();
	}
}
