package detailScreen;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DetailManager{
	static DetailVO[] detail=new DetailVO[11];
	static{
		try{
			Document doc=Jsoup.connect("https://www.idus.com/").get();
			Elements link=doc.select("div.ui_card__imgcover a");
			int mno=0;//메뉴번호
			for(int i=0; i<10; i++){  
				detail[i]=new DetailVO();
				//System.out.println("https://www.idus.com/"+link.get(mno).attr("href"));
				Document doc2=Jsoup.connect("https://www.idus.com/"+link.get(mno).attr("href")).get();
				Element artist=doc2.selectFirst("span.artist_card__label");
				Element title=doc2.selectFirst("h2.sticky_aside__produc-title");
//				Element discountRate=doc2.selectFirst("");
//				Element price=doc2.selectFirst("");
//				Element viewCount=doc2.selectFirst("");
//				Element point=doc2.selectFirst("");
//				Element grade=doc2.selectFirst("");
//				Element deliveryCost=doc2.selectFirst("");
//				Element freeDelivery=doc2.selectFirst("");
//				Element toArrival=doc2.selectFirst("");
				Element stock=doc2.selectFirst("div.tab span");
//				Element totalPrice=doc2.selectFirst("");
				detail[i].setArtist(artist.text());;
				detail[i].setTitle(title.text());
				detail[i].setStock(stock.text());
				mno++;
			}
		} catch(Exception ex){
		}
	}

	public static void main(String[] args){
		DetailManager m=new DetailManager();
		for(DetailVO vo : detail){

			System.out.println("===================");
			System.out.println("작가:"+vo.getArtist());
			System.out.println("제목:"+vo.getTitle());
			System.out.println("수량:"+vo.getStock());
		}
	}
}
