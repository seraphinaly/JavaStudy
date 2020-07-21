package com.sist.data;
//캡슐화
public class FoodHouseVO{
	private int cno; //카테고리 번호
	private int no; //카테고리내 번호
	private String poster;//그림 5개, 배열 안잡고 split 사용
	private String review;
	private String title;
	private double score;
	private String address;
	private String tel;
	private String type;
	private String price;
	private String parking;
	private String time;
	private int good;
	private int soso;
	private int bad;
	
	public String getReview(){
		return review;
	}
	public void setReview(String review){
		this.review=review;
	}
	public int getCno(){
		return cno;
	}
	public void setCno(int cno){
		this.cno=cno;
	}
	public int getNo(){
		return no;
	}
	public void setNo(int no){
		this.no=no;
	}
	public String getPoster(){
		return poster;
	}
	public void setPoster(String poster){
		this.poster=poster;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public double getScore(){
		return score;
	}
	public void setScore(double score){
		this.score=score;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getTel(){
		return tel;
	}
	public void setTel(String tel){
		this.tel=tel;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
		this.price=price;
	}
	public String getParking(){
		return parking;
	}
	public void setParking(String parking){
		this.parking=parking;
	}
	public String getTime(){
		return time;
	}
	public void setTime(String time){
		this.time=time;
	}
	public int getGood(){
		return good;
	}
	public void setGood(int good){
		this.good=good;
	}
	public int getSoso(){
		return soso;
	}
	public void setSoso(int soso){
		this.soso=soso;
	}
	public int getBad(){
		return bad;
	}
	public void setBad(int bad){
		this.bad=bad;
	}
	
}
