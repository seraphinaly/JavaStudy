package com.sist.data;

public class CampingVO {
	private int mno;
	private int cno; //카테고리 번호 (주간 ,월간, 연간)
	private String title;			// 제목
	private String poster;			// 사진
	private String event;			// 이벤트
	private String star_value;		// 별점
	private String price;			// 가격
	private String review;			// 리뷰횟수
	private String location;		// 위치
	private String detail_location; // 상세위치
	private String boss;			// 사장님 한마디 
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getStar_value() {
		return star_value;
	}
	public void setStar_value(String star_value) {
		this.star_value = star_value;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDetail_location() {
		return detail_location;
	}
	public void setDetail_location(String detail_location) {
		this.detail_location = detail_location;
	}
	public String getBoss() {
		return boss;
	}
	public void setBoss(String boss) {
		this.boss = boss;
	}
	
	

}
