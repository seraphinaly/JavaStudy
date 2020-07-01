/*	startsWith
 * 	endsWith
 */ 
import java.util.*;
 
public class 문자열4_검색어_starts_EndsWith{

	public static void main(String[] args) throws Exception{
		
		String[] data= {
				"Java Program",
				"Oracle Program",
				"JSP Program",
				"Oracle AND Java",
				"Java AND JSP",
				"Ajax Program",
				"Spring AND Mobile",
				"Kotlin Program",
				"XML AND Annotation",
				"Java AND JQuery"
		};
		
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String ss=scan.nextLine(); //enter만 인식, next()는 enter/space 인식
		for(String s:data) {
			if(s.startsWith(ss) || s.endsWith(ss)) {
				System.out.println(s);
				Thread.sleep(500);
			}
		}
		
	}

}
