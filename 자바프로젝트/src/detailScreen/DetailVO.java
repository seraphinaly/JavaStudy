package detailScreen;

public class DetailVO{
	private String artist;
	private String title;
	private String discountRate;
	private String price;
	private String viewCount;
	private String point;
	private double grade;//별점
	private String deliveryCost;
	private String freeDelivery;
	private String toArrival;
	private String stock;
	private String totalPrice;
	
	//getter,setter 설정
	public String getArtist(){
		return artist;
	}
	public void setArtist(String artist){
		this.artist=artist;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getDiscountRate(){
		return discountRate;
	}
	public void setDiscountRate(String discountRate){
		this.discountRate=discountRate;
	}
	public String getPrice(){
		return price;
	}
	public void setPrice(String price){
		this.price=price;
	}
	public String getViewCount(){
		return viewCount;
	}
	public void setViewCount(String viewCount){
		this.viewCount=viewCount;
	}
	public String getPoint(){
		return point;
	}
	public void setPoint(String point){
		this.point=point;
	}
	public double getGrade(){
		return grade;
	}
	public void setGrade(double grade){
		this.grade=grade;
	}
	public String getDeliveryCost(){
		return deliveryCost;
	}
	public void setDeliveryCost(String deliveryCost){
		this.deliveryCost=deliveryCost;
	}
	public String getFreeDelivery(){
		return freeDelivery;
	}
	public void setFreeDelivery(String freeDelivery){
		this.freeDelivery=freeDelivery;
	}
	public String getToArrival(){
		return toArrival;
	}
	public void setToArrival(String toArrival){
		this.toArrival=toArrival;
	}
	public String getStock(){
		return stock;
	}
	public void setStock(String stock){
		this.stock=stock;
	}
	public String getTotalPrice(){
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice){
		this.totalPrice=totalPrice;
	}	
}