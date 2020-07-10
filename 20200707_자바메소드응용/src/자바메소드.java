/* 메소드: 한 가지 기능만 수행 => 목적: 다른 프로그램에서의 재사용, 반복되는 코드 제거
 * 		  반환형(리턴형) 메소드명(매개변수1,2...)
 *                        ============사용자 요청값 대입하는 곳
 *                        
 *       return; → 강제 종료. 중간에서도 사용 가능.
 *        		   return(,continue,break) 문장 밑에는 소스코딩 할 수 없음(∵프로그램 종료/제외 후 수행 불가)    
 *      
 *       **오버로딩:추가(new), 오버라이딩:수정(change,modify)
 */

//사용자가 연도 입력하면 윤년여부
import java.util.*;
public class 자바메소드{
	
	//메소드1:사용자 연도 입력 기능 →
	static int userInput() { //Scanner는 메소드 자체에서 입력값을 받는거라 매개변수 필요없음
		Scanner sc=new Scanner(System.in);
		System.out.print("연도 입력:");
		int year=sc.nextInt();
		return year;
	}
	
	//메소드2:윤년여부 확인 기능 → 재사용
	static boolean isYear(int year) {
		boolean bCheck=false;
		if((year%4==0&&year%100!=0)||year%400==0) {
			bCheck=true;
		} else {
			bCheck=false;
		}
		return bCheck;
	}

	public static void main(String[] args){
		int year=userInput();
		boolean bCheck=isYear(year);
		if(bCheck==true)
			System.out.println(year+"년은 윤년입니다.");
		else
			System.out.println(year+"년은 윤년이 아닙니다.");
	}

}
