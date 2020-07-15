package com.sist.oop;
/*package: 폴더 이름>>.으로 구분(com,sist,oop 3개 폴더)
 *    com.회사명.기능명; ->com.sist.client;, com.sist.server;
 *    org.조직명.기능명; ->org.springframework.web.servlet.view.*;
 * 자바 전체구조
 *   1번째줄:package명(1번만 사용)
 *   2번째줄:import
 *   3번째줄:public class className{
 *           필요한 변수 설정=>멤버변수
 *           변수에 대한 초기화=>생성자
 *           기능=>메소드
 *         }
 *   =>다른 클래스에서 사용시
 *   	import com.sist.oop.*; 
 *   
 *     캡슐화
 *     	=>변수는 private
 *     	=>메소드는 public ==> 변수 getter/setter
 *     상속:extends~, 단일상속만 가능
 *     다형성: 수정,추가
 *     =========(객체지향:문법사항이 아니라 권장사항)
 */
/*오버로딩(생성자에서 주로 사용)
 * 같은 메소드명으로 여러 개의 기능을 만든다
 * 1.매개변수가 달라야함(개수,데이터형)
 * 2.리턴형은 관계X
 * 3.같은 클래스 안에서 만들 수 있다
 */

class Calc{
	//인스턴스 메소드: new 사용할때 저장되는 메소드
	public void plus(int a, int b) {
		System.out.printf("%d+%d=%d\n",a,b,a+b);
	}
//	public int plus(int a, int b) { //리턴형 상관없이 매개변수 종류 같으면 같은 메소드
//		return a+b;
//	}
	public void plus(double a,double b) {
		System.out.printf("%f+%f=%f\n",a,b,a+b);
	}
	public void plus(String a,String b) {
		System.out.printf("%s+%s=%s\n",a,b,a+b);
	}
}
/*
 * 메소드
 * 	멤버메소드
 * 	static메소드: 공용이라 인스턴스 변수 사용불가
 */
public class 오버로딩_중복메소드정의{
	int a=10;
	static int b=20;
	public 오버로딩_중복메소드정의() {
		System.out.println("this="+this);
	}
	
	public void disp1(int aa) {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println("this="+this);
	}
	
	public static void disp2() { //this가 없다(공통이라 본인 것이 없음)
		오버로딩_중복메소드정의 aa=new 오버로딩_중복메소드정의();
		System.out.println(aa.a);
		System.out.println(b);
	}
	
	public static void main(String[] args){
		Calc cc=new Calc();//메소드 전체 저장
		cc.plus("Hello", "Java");
		cc.plus(100, 200);
		오버로딩_중복메소드정의 aa=new 오버로딩_중복메소드정의();
		System.out.println("aa="+aa);
		System.out.println(aa.a);
	}

}
