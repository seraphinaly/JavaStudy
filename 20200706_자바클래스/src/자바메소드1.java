/* 1.메소드 생성 방법
 * 	1)자동으로 메모리에 저장 → 정적 메소드
 * 		형식)
 * 		static 리턴형(결과값) 메소드명(매개변수...){
 * 		      return 값
 * 		}
 * 	2)프로그래머가 메모리를 만든 다음 저장 → 인스턴스 메소드
 * 		→new 연산자를 이용해서 저장 가능
 *  	→프로그램의 중심  
 * 		리턴형(결과값) 메소드명(매개변수...){
 * 		 	  return 값
 * 		}
 * 	3)메소드의 선언부만 사용 → 추상 메소드
 * 		리턴형(결과값) 메소드명(매개변수...); → 추상클래스(인터페이스)
 * 
 * 2.메소드 형태
 * 	 ┌ 선언부: 메모리에 저장 안됨
 *   └ 구현부: 메모리에 저장  → 필요한 위치에서 사용 가능
 *  		 → 리턴형(결과값):반드시 한 개만 설정
 *  					  ┌ 기본형(정수,실수,···)
 *  					  └ 배열,클래스(여러개의 데이터를 모아 한번에 전송)
 *  		 → 사용자 입력값(=매개변수,인자,인수): 사용자 요청값(한 개, 여러 개 가능)
 *  									  단,3개 초과시 되도록 배열/클래스 사용 
 *  					
 *  		 → return문: 메소드가 종료되는 시점 → 모든 메소드에는 반드시 return 존재  
 *  	  	      예외)결과값이 없는 경우(void)에는 return 생략 가능(∵JVM에서 자동으로 return 추가) 
 *  
 *  	결과값(=리턴값,반환값)? / 사용자로부터 받는 값(=매개변수,인자,인수...)?
 *      
 *      1)사용자로부터 정수 입력받아 해당 구구단을 출력하는 경우
 *       	i)결과값(O),매개변수(O): 구구단을 묶어서 넘겨준다
 *      	  String
 *         ii)결과값(X),매개변수(O): 메소드 안에서 출력(선생님 pick)
 *			  void      
 *
 *		  *메소드는 클래스 내에 존재해야함
 *		 **메소드 안에 메소드는 선언할 수 없음
 *		***메소드 이름은 같을 수 있음 → overloading     
 *			                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
 */
import java.util.*;
public class 자바메소드1{
	static String 구구단1(int dan) {
		//출력 포함안됨
		String gu="";
		for(int i=1;i<=9;i++) {
			gu+=dan+"*"+i+"="+dan*i+"\n";
		}
		return gu;
	}
	
	static void 구구단2(int dan) {
		//전체처리(블록 내 출력)
		for(int i=1;i<=9;i++) {
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력:");
		int dan=sc.nextInt();
		//구구단 출력할 메소드 호출
		구구단2(dan);
		
		String s=구구단1(9); //메소드에 dan=9 넘겨주고, 수행된 결과값을 String s에 저장한 후 다음문장으로 넘어감
		System.out.println(s);
		for(int i=2;i<=9;i++) {
			String s=구구단1(i); //반복기능 제거
			System.out.println(s);		
		}
		return;//메소드 종료(생략 가능)
	}
}
