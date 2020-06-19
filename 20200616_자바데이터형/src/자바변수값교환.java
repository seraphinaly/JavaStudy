/*
 * 1.데이터형 확인(정수/실수/문자/논리)
 *    ex)자바게임 총알 좌표 >> x,y (int)
 *             키보드 값 >> char
 *             점수에 대한 평균 >> double
 *             총점수 누적 >> long (2억점 이상 나온다면)
 *             게임종료 여부확인 >> true/false(boolean)
 *             
 * 2.데이터 저장방법
 *    -한 개 저장시 변경해서 사용하는 데이터: 변수(데이터형+변수형)
 *              변경해서 사용불가한 데이터: 상수(final+데이터형+변수형)
 *    -여러 개 저장시 같은 유형: 배열
 *               다른 유형: 클래스 => 사용자 정의 데이터형
 *
 * 3.메모리를 만드는 방식(변수 선언)
 *   데이터형 변수명;
 *      int a;
 *     long A;
 *   double b;   
 *     char c;
 *  boolean d;
 *
 * 4.변수에 대한 초기값: 아무거나 해도 나중에 변경하면 됨.
 *      int a=0;
 *     long A=0l;
 *   double b=0.0;   
 *     char c='A';
 *  boolean d=false;
 *  
 * 5.변수값 변경하는 방법
 *   int a=10;
 *   
 *   a=100; 
 *   a=200;
 *   a=300;
 *   
 * 6.변수끼리 교환: tmp라는 임시변수 필요
 * 
 * 7.변수명 명명규칙(식별자)
 *  1)알파벳(대소문자 구분, a != A), 한글로 시작
 *  2)숫자 사용 가능(단, 맨 앞에 사용할 수 없음)
 *  3)특수문자  _ , $ 사용 가능 (_는 주로 임시파일명 맨 앞이나 단어가 여러개일 경우 중간에 사용)
 *  4)키워드 사용 불가(자바에서 사용중인 단어, 붉게 표시). 꼭 사용 해야하는 경우 숫자나 _ 등 사용
 *    ex) int int1 (O)
 *  5)변수의 길이는 15자 이내(보통 3~7자리)
 */

public class 자바변수값교환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=100;
		int y=200;
		int tmp=x;   //임시변수 tmp 선언
		x=y;         //y=200을 x에 대입해라
		y=tmp;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		
	}

}
