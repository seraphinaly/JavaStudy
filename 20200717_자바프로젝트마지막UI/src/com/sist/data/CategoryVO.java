package com.sist.data;
//데이터형: 캡슐화방식
public class CategoryVO{
	private int cno; //카테고리 번호
	private String title;
	private String subject;
	private String poster;
	private String link;
	public int getCno(){
		return cno;
	}
	public void setCno(int cno){
		this.cno=cno;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getSubject(){
		return subject;
	}
	public void setSubject(String subject){
		this.subject=subject;
	}
	public String getPoster(){
		return poster;
	}
	public void setPoster(String poster){
		this.poster=poster;
	}
	public String getLink(){
		return link;
	}
	public void setLink(String link){
		this.link=link;
	}
	
	
}
