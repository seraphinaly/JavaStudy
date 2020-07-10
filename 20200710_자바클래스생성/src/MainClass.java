/* 클래스:변수 여러 개를 저장할 때(공통으로 들어가는 데이터)
 * 
 * 변수의 종류
 * 	1.멤버변수(인스턴스변수):new를 사용할 때마다 따로 저장되는 변수
 * 					   =>new 사용시 heap(프로그래머가 관리;직접처리,GC)에 메모리 생성 
 * 	2.공유변수(정적변수):메모리가 한개=>공통으로 사용되는 변수
 * 					  =>컴파일러가 컴파일 할 때 자동으로 메모리 생성
 * 	3.지역변수=>지역번수,매개변수
 * 				=>메소드 호출시 메모리 생성
 * 				=>스택: 메모리 자체 관리, {} 벗어나면 자동 회수(LIFO)
 * 					int a;  c>>b>>a 순서대로 제거
 * 					int b; 
 * 					int c;
 * 
 * 생성자:멤버변수의 초기값 부여
 * 	-제어문 이용하거나 파일 읽기
 * 	-구현하고 데이터 값 가지고 올 때, 보안
 * 	-생략 가능, 자동으로 컴파일러가 default 생성자 추가(∵생성자는 반드시 필요)
 * 	-new 생성자() => 한번만 호출한다 =>this 사용
 * 
 * 메소드
 * 	-인스턴스 메소드:클래스마다 따로 사용하는 메소드
 * 	-정적 메소드:static=>모든 클래스 공통으로 사용되는 메소드
 * 	-추상 메소드:선언부만 존재(구현이 안 된 메소드=>프로그래머가 구현 후 사용) p.377
 */
class Student{
	//학생 1명에 대한 정보=>메모리 공간 여러 개 만들 수 있음(new)
	String name;
	String subject;
	int year;
	static String school;
	//초기값 존재:null,null,0
}
public class MainClass{

	public static void main(String[] args){
		Student.school="SIST";
		Student s=new Student(); //name,year,subject=>저장(s의 주소)
		System.out.println(s);//Student@15db9742
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		s.name="신윤수";
		s.subject="개발과";
		s.year=3;
		//메소드도 동일
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		System.out.println(Student.school);
		
		Student s1=new Student();
		System.out.println(s1);//Student@6d06d69c
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.year);
		s1.name="현보영";
		s1.subject="컴공과";
		s1.year=2;
		System.out.println(s1.name);
		System.out.println(s1.subject);
		System.out.println(s1.year);
		System.out.println(Student.school);
		
		String ss="Hello Java";
		ss.replace('H','k');
		String ss1="1234567890";
		String.valueOf(10);
		
		
	}

}
