package com.sist.data;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class MainClass3{
	public static FoodHouseVO[] categoryFoodData() {
		FoodHouseVO[] food=new FoodHouseVO[10];
		try {
			Document doc=Jsoup.connect("https://www.mangoplate.com/top_lists/"
													+ "1965_hotel_bingsu").get();
			Elements title=doc.select("span.title h3");
			Elements score=doc.select("strong.point span");
			Elements address=doc.select("p.etc");
			Elements poster=doc.select("img.center-croping");
			Elements review=doc.select("p.short_review");
			
			for(int i=0;i<10;i++) {
				System.out.println(title.get(i).text());
				System.out.println(score.get(i).text());
				System.out.println(address.get(i).text());
				System.out.println(poster.get(i).attr("data-original"));
				System.out.println(review.get(i).text());
				food[i]=new FoodHouseVO();
				food[i].setTitle(title.get(i).text());
				food[i].setScore(Double.parseDouble(score.get(i).text())); //���ڿ������ ��ȯ
				food[i].setAddress(address.get(i).text());	               //Wrapper Class
				food[i].setPoster(poster.get(i).attr("data-original"));
				food[i].setReview(review.get(i).text());
				/* ========����!!========
				 * text(): <p>aaa</p>
				 * attr(): <p data="aaa"/>
				 */
			}
		}catch(Exception ex) {
			ex.printStackTrace(); //������ġ Ȯ��
		}
		return food;
	}
	
	//(CategoryVO��)14�� ������ �ϳ��� �迭�� ����
	public static CategoryVO[] categoryListData(){
		CategoryVO[] cate=new CategoryVO[10];
		try{ //��Ʈ��ũ ���α׷� �� ����ó�� �ʼ�
			Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
			Elements title=doc.select("div.info_inner_wrap span.title");
			Elements subject=doc.select("div.info_inner_wrap p.desc");
			Elements poster=doc.select("ul.list-toplist-slider img.center-croping");
			//Elements link=doc.select("");
			for(int i=0; i<10; i++){
				System.out.println("===========================");
				System.out.println(title.get(i).text()); 
				System.out.println(subject.get(i).text());
				System.out.println(poster.get(i).attr("data-lazy"));
				cate[i]=new CategoryVO();
				cate[i].setCno(i+1);
				cate[i].setTitle(title.get(i).text());
				cate[i].setSubject(subject.get(i).text());
				cate[i].setPoster(poster.get(i).attr("data-lazy"));
			}
		} catch(Exception ex){
			ex.printStackTrace(); //���� �� ��� ���������� Ȯ��
		}
		return cate;
	}

	public static void main(String[] args){
		categoryFoodData();		
	}
}
