package com.sist.project;

import java.io.FileWriter;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MovieManager{
	public void movieAllData(){
		ArrayList<MovieVO> list=new ArrayList<MovieVO>();
		String[] site= { "https://movie.daum.net/premovie/released?reservationOnly=N&sort=reservation&page=",
				"https://movie.daum.net/premovie/scheduled?reservationOnly=N&sort=reservation&page=",
				"https://movie.daum.net/boxoffice/weekly", "https://movie.daum.net/boxoffice/monthly",
				"https://movie.daum.net/boxoffice/yearly" };
		//HTML: 브라우저에서 실행되는 언어
		//태그<>, 속성(ex.href,class 등)으로 구성
		//화면UI => 구분 => id(중복이 없다,#), class(중복 가능,.)
		int mno=107;
		int cno=5;
		//for(int i=1; i<=6; i++){ //for문 안에 try~catch 잡을것
		try{
			//사이트 연결해서 데이터 읽어들임=> 메모리 저장: Document
			Document doc=Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get();
			Elements link=doc.select("a.name_movie");
			for(int j=0; j<link.size(); j++){
				//class Elements extends ArrayList
				//System.out.println(link.get(j).attr("href"));
				//상세보기
				try{
					String url="https://movie.daum.net"+link.get(j).attr("href");
					Document doc2=Jsoup.connect(url).get();

					Element poster=doc2.selectFirst("span.thumb_img img");
					System.out.println("포스터:"+poster.attr("src"));
					Element title=doc2.selectFirst("span.txt_name");
					System.out.println("제목:"+title.text());
					Element score=doc2.selectFirst("div.info_origin a");
					System.out.println("등급:"+score.text());
					Element director=doc2.selectFirst("a.link_person");
					System.out.println("감독:"+director.text());
					Element actor=doc2.select("dd.type_ellipsis a.link_person").get(1);
					System.out.println("출연:"+actor.text());
					Element genre=doc2.select("dl.list_movie dd").get(0);
					System.out.println("장르:"+genre.text());
					Element regdate=doc2.select("dl.list_movie dd").get(2);
					System.out.println("개봉일:"+regdate.text());
					Element grade=doc2.select("dl.list_movie dd").get(3);
					System.out.println(grade.text());
					System.out.println("등급:"+score.text());
					Element showUser=doc2.selectFirst("dd#totalAudience em.emph_g");
					System.out.println("누적:"+showUser.text()+"명");
					Element story=doc2.selectFirst("div.desc_movie p");
					System.out.println("줄거리:"+story.text());

					String msg=mno+"|"+cno+"|"+title.text()+"|"+poster.attr("src")+"|"+title.text()+"|"+score.text()+"|"
							+director.text()+"|"+actor.text()+"|"+genre.text()+"|"+regdate.text()+"|"+grade.text()+"|"
							+score.text()+"|"+showUser.text()+"|"+story.text()+"\r\n";
					//파일에 저장
					FileWriter fw=new FileWriter("c:\\javaDev\\daum.movie.txt", true);
					fw.write(msg);
					fw.close();
					mno++;

				} catch(Exception ex){
				}
			}
		} catch(Exception ex){
			System.out.println(ex.getMessage());//에러 메세지 출력
		}
	}

	//finally: 파일닫기, 오라클 서버 연결해제, 네트워크 서버 => 여기서는 다음 서버 사용하기때문에 안해줘도됨
	//	}
	public void daumNewsData(){
		try{
			for(int i=1; i<=11; i++){
				Document doc=Jsoup.connect("https://movie.daum.net/magazine/new?tab=nws&regdate=20200727&page="+i)
						.get();
				Elements title=doc.select("strong.tit_line a.link_txt");
				Elements poster=doc.select("a.thumb_line span.thumb_img");
				Elements content=doc.select("a.desc_line");
				Elements author=doc.select("span.state_line");
				Elements link=doc.select("strong.tit_line a.link_txt");
			

				for(int j=0; j<title.size(); j++){
					System.out.println(title.get(j).text());
					System.out.println(poster.get(j).attr("style"));
					System.out.println(content.get(j).text());
					System.out.println(author.get(j).text());
					System.out.println(link.get(j).attr("href"));
				}
			}
		} catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		// 객체 생성 
		MovieManager m=new MovieManager();
		//m.movieAllData();
		m.daumNewsData();
	}

}
