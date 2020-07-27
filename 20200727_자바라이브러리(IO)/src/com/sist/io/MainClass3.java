package com.sist.io;
import java.io.*;
import java.util.*;

class Movie implements Serializable{
	private int mno;
	private String title;
	private String actor;
	public int getMno(){
		return mno;
	}
	public void setMno(int mno){
		this.mno=mno;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getActor(){
		return actor;
	}
	public void setActor(String actor){
		this.actor=actor;
	}
	
}

public class MainClass3{

	public static void main(String[] args){
		try {
			ArrayList<Movie> list=new ArrayList<Movie>();
			
			Movie m=new Movie();
			System.out.println(m);
			m.setMno(1);
			m.setTitle("ȫ�浿��");
			m.setActor("ȫ�浿");
			list.add(m);
			
			m=new Movie(); //���� ���� ����!!
			System.out.println(m);
			m.setMno(2);
			m.setTitle("��û��");
			m.setActor("��û");
			list.add(m);
			
			m=new Movie();
			System.out.println(m);
			m.setMno(3);
			m.setTitle("������");
			m.setActor("����");
			list.add(m);
			
			ObjectOutputStream oos=
					new ObjectOutputStream(
							new FileOutputStream("c:\\javaDev\\movie_test.txt"));
			oos.writeObject(list);
			System.out.println("���� �Ϸ�!");
			
//			for(int i=0;i<list.size();i++) {
//				Movie mm=list.get(i);
//				System.out.println(mm.getActor());*/
//			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			
		}

	}

}
