/* 참조형 변수: 배열, 클래스
         문자열 저장변수 => String
         형식) String s="ABCDEF" => 웹, 윈도우(모든 데이터가 문자열)
       ==>String: (종단)클래스 -- 변경해서 사용불가
                     제공기능 => 1. 문자개수   s.length() : 6
                    2. ()번째 글자를 char로 저장 s.charAt(0) : 'A' */
//사용자가 문자열 입력: 대소문자 개수 확인
import java.util.*;
public class 반복문_while3 {

	public static void main(String[] args) {
	String s="ABCDEFG"; //문자 여러 개 저장
	System.out.println(s);
	Scanner scan=new Scanner(System.in);
	System.out.print("문자열을 입력하세요>> ");
	s=scan.nextLine();  //문자열 메소드: next(), nextInt()
	     //nextLine은 공백까지 인식, Scanner에서 next() 쓰면 공백 전까지만 인식
	System.out.println(s);
//	System.out.println("개수:"+s.length()); 
	
	int a=0, b=0; //a:소문자 개수, b: 대문자 개수
	int i=0; //문자의 개수만큼 증가하는 변수: 루프변수(루프가 몇번 돌아갔는지 확인)
	/* ABCDEFG 개수는 7개 
	   0123456  번호는 6번까지=> Java는 숫자 셀 때 0번부터 시작, 부등호는 <=가 아닌 <를 씀!!! */
	while(i<s.length()) {
		char c=s.charAt(i);
		if(c>='A'&&c<='Z')
			b++; //대문자 개수 확인
		if(c>='a'&&c<='z')
			a++; //소문자 개수 확인
		i++;	 //i가 문자 개수만큼 증가
	}
	System.out.println("대문자 개수:"+b);
	System.out.println("소문자 개수:"+a);
	

	}

}
