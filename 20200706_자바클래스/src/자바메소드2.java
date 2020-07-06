
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


/*
 * <td class="info">
<a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('90443299','1');return false;">
   
            How You Like That</a>
*/
public class 자바메소드2{
	static String[] genieMusicData() throws Exception{
		/* 예외처리: 에러 방지
		 * 		에러 직접 처리 → try~catch
		 * 		      회피(시스템이 간접처리) → throws
		 */
		String[] data=new String[50];
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title=doc.select("td.info a.title");
		
		for(int i=0;i<50;i++) {
			data[i]=title.get(i).text();
		}
		return data;
	}
	static String[] genieMusicFind(String ss) throws Exception{
		String[] data=genieMusicData();
		int k=0;
		for(String title:data) {
			if(title.contains(ss)) {
				k++;
			}
		}
		String[] find=new String[k];
		k=0;
		for(String title:data) {
			if(title.contains(ss)) {
				find[k]=title;
				k++;
			}
		}
		return find;
	}
	public static void main(String[] args) throws Exception{
		String[] data=genieMusicData();
		for(String title:data) {
			System.out.println(title);
		}	
			System.out.println("=================");
		Scanner sc=new Scanner(System.in);
		System.out.print("곡명을 입력하세요.");
		String ss=sc.nextLine();
		String[] fd=genieMusicFind(ss);
		for(String title:fd) {
			System.out.println(title);
		}
		
				
	}
}