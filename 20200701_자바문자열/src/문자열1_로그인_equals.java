
/* 문자열 비교 	 equals(): 대소문자 구분
 * (cf.==)	 equalsIgnoreCase():대소문자 구분x 	
 * 문자 찾기	 contains()
 * 시작 문자열 	 startsWith()
 * 끝 문자열    	 endsWith()
 * 문자열 자르기   substring()
 * 문자 추출 	 charAt()
 * 문자 개수 	 length()
 * 공백 제거	 trim()
 * 문자 위치찾기   indexOf(),lastIndexOf()
 * 형변환		 valueOf()
 */
//로그인 처리
import java.util.*;
import javax.swing.*;

public class 문자열1_로그인_equals{

	public static void main(String[] args){
		//ID,PW
		final String ID="admin";
		final String PW="1234";		
				
		Scanner scan=new Scanner(System.in);
		System.out.print("ID 입력:");
		String id=scan.nextLine();
		System.out.print("비밀번호 입력:");
		String pw=scan.nextLine();
		
		//결과
		if(id.equalsIgnoreCase(ID) && pw.equals(PW)) {
			System.out.println("로그인 완료!");
		} else {
			System.out.println("ID나 비밀번호가 틀립니다.");
		}

	}

}
