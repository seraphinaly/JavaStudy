package com.sist.exception;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 <ul class="list-toplist-slider" style="width: 531px;">
            <li>
              <img class="center-croping" alt="티라미수 맛집 베스트 50곳 사진"
                   data-lazy="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/rjo80nepigkxn637.png?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80"/>

              <a href="/top_lists/633_tiramisu"
                 onclick="trackEvent('CLICK_TOPLIST', {&quot;section_position&quot;:0,&quot;section_title&quot;:&quot;믿고 보는 맛집 리스트&quot;,&quot;position&quot;:0,&quot;link_key&quot;:&quot;LMUMANJ&quot;});">
                <figure class="ls-item">
                  <figcaption class="info">
                    <div class="info_inner_wrap">
                      <span class="title">티라미수 맛집 베스트 50곳</span>
                      <p class="desc">"최애 디저트는 당근 티라미수 아니겠어?"</p>
 */
public class MainClass3{
	//14개 변수를 하나의 배열로 묶음(CategoryVO)
	public static CategoryVO[] categoryListData(){
		CategoryVO[] cate=new CategoryVO[10];
		try{ //네트워크 프로그램 → 예외처리 필수
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
			ex.printStackTrace(); //에러 시 어디서 오류났는지 확인
		}
		return cate;
	}

	public static void main(String[] args){
		//URL => https://www.mangoplate.com/ => CheckException
		try{ //네트워크 프로그램 → 예외처리 필수
			Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
			//System.out.println(doc);
			Elements title=doc.select("div.info_inner_wrap span.title");
			Elements subject=doc.select("div.info_inner_wrap p.desc");
			Elements poster=doc.select("ul.list-toplist-slider img.center-croping");
			//Elements link=doc.select("");
			for(int i=0; i<10; i++){
				System.out.println("===========================");
				System.out.println(title.get(i).text()); //안에 있으면 text
				System.out.println(subject.get(i).text());
				System.out.println(poster.get(i).attr("data-lazy"));//밖에 있으면 attr
						//소스에서 필요한 부분 저장하기
				//				try{
				//					String temp=(i+1)+"|"+title.get(i).text()+"|"+subject.get(i).text()+"|"
				//							+poster.get(i).attr("data-lazy")+"\r\n";
				//					FileWriter fw=new FileWriter("c:\\javaDev\\category.txt", true); //true: 모든 줄 저장
				//					fw.write(temp);
				//					fw.close(); //category.txt //파일을 만들어서 긁어온 데이터 저장
				//				} catch(Exception ex){
				//					ex.printStackTrace();
				//				}
			}
		} catch(Exception ex){
			ex.printStackTrace(); //에러 시 어디서 오류났는지 확인
		}
	}

}
