
public class MainClass1 {
    public static void main(String[] args) {
		// 자바 표현법
    	/*
    	 * 정수
    	 *  = 10진법 10,20,...
    	 *  = 8진법(0) 
    	 *       011 = 9
    	 *  = 16진법(0x)
    	 *       0x10
    	 *  = 2진법(0b)
    	 *       0b1010
    	 * 실수
    	 *  = 저장 크기 => 4byte(소수점 이하 8자리)   10.5f
    	 *           => 8byte(소수점 이하 16자리)  10.5(d,생략가능)
    	 * 문자
    	 *  = '' =>한 글자만 저장, 한글 사용가능 [Java: Unicode(2byte) 사용, C: ASC(아스키, 1byte) 사용]
    	 * 문자열
    	 *  = "" =>여러 글자 저장
    	 *  
    	 *  UTF-8 : 브라우저의 경우  아스키 코드 사용, 한글이 깨져서 ?로 나옴
    	 */

    	System.out.println('A');
    	System.out.println("Hello");

    	System.out.println(10.0000000005);
    	System.out.println(10.0000000005f);
    	System.out.println(10.0000000005F);  //대소문자 구분 없음, d는 생략가능
    	
    	System.out.println(10); // 명령 프롬프트에 10을 출력
    	System.out.println(0b01010);
    	System.out.println(012);
    	System.out.println(0xA);
    	
    	/*
    	 * 1. 기본문법
    	 *   1)대소문자 구분
    	 *    -라이브러리[클래스: 대소문자, 메소드: 소문자, 상수: 모두 대문자 (ex.PI=3.14)]
    	 *    -변수/상수
    	 *     int kor=100;
    	 *     final int KOR=200;
    	 *     
    	 *    2)명령문이 종료되면 반드시 ;
    	 *    
    	 *    3)들여쓰기
    	 */
    	
    }
}

 