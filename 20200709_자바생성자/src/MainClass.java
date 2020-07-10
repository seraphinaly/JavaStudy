
/*
 * 클래스
 * 1)구성요소
 *   변수=> 기본형(String: 참조형)
 *   메소드=> 기능처리(연산자, 제어문)
 *   생성자=> 선언한 변수에 대한 초기값=> 존재하지 않을 수 있다
 *      특징
 *      1.클래스명과 동일
 *      2.리턴형이 없다
 *      3.여러 개 존재가능=> 오버로딩: 같은 함수인데 다른 기능
 *      ***오버로딩
 *      	1)같은 이름의 메소드
 *      	2)한개의 클래스 안에서 제작
 *      	3)매개변수의 개수나 데이터형이 다르다
 *      	4)리턴형은 상관없다
 *      4.생성자가 하는 역할
 *      	1)클래스를 메모리에 저장할 경우 반드시 호출되어야 함
 *      	2)멤버변수의 초기값 담당
 *      		=윈도우, 네트워크, 쓰레드, 데이터베이스 연결
 *      	***클래스 영역	
 *		      public class MainClass{
 *					제어문,연산처리 기능 수행X => {}안에서 작업가능(메소드)
 *					변수 선언만 가능
 *					1)기본형
 *					2)클래스
 *					3)배열
 *			  }
 *			*** 구현=> 연산,제어문,라이브러리 =>메소드 안에서만 사용가능
 *			       선언=> 클래스 영역 안에서는 선언만 가능
 *			
 *			변수: 저장,변경,읽기
 *				배열,클래스=> 변수의 일종
 *			따로 저장해서 사용하는 변수: 멤버변수,인스턴스변수
 *			한개만 저장해서 공통사용 변수: 정적변수,클래스변수,공유변수
 *
 *			class에서 만드는 메소드
 *				1)따로저장: 인스턴스메소드
 *				2)공통으로 사용:정적메소드
 *				3)저장에 필요한 메소드:생성자메소드->생성자는 static없음
 *					생성자가 없는경우에 가상머신이 자동으로 default 생성자를 추가
 */
//import javax.swing.*;

//public class MainClass{
//	JComboBox box=new JComboBox();
//구현해서 초기값을 주기 위해서 
//	1.블록 사용
//  {

//		box.addItem("영화");
//		box.addItem("음악");
//		box.addItem("맛집");
//	}
//	2.생성자 사용
//	MainClass(){
//	box.addItem("영화");
//	box.addItem("음악");
//	box.addItem("맛집");
//	}

public class MainClass{
	String book="Java의 정석";
	String author="남궁성";
	static String publisher="도우출판";
	
	public static void main(String[] args){
		MainClass m=new MainClass();
		System.out.println("책 이름:"+m.book);
		System.out.println("저자:"+m.author);
		//static 변수
		System.out.println("출판사:"+m.publisher); //1.객체
		System.out.println("출판사:"+MainClass.publisher); //2.클래스이름,권장
		System.out.println("출판사:"+publisher); //3.같은 클래스 내:변수명만 사용 가능
												 //다른 클래스에서 사용시 2번처럼 써야함
		
		/* 인스턴스 변수 vs 공유변수
		 * 공유변수(static):자동으로 메모리에 저장
		 * 인스턴스 변수:new 이용해서 메모리 공간을 만들고 저장
		 * ***스프링은 new를 사용하지 말아야함=>리플렉션
		 */
		
	}

}
