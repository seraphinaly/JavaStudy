//정수 입력값 2개 받아 사칙연산
import java.util.*;
public class 다중조건문3_중첩if문 {

	public static void main(String[] args) {
		int a=0, b=0;
		char op='+';
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 개의 정수 입력:(90 100)");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("연산자 입력(+,-,*,/):");
		op=scan.next().charAt(0); //char는 문자인식이 안되기 때문에 첫자 잘라서 변환
		
		if(op=='+') {
			System.out.printf("%d+%d=%d\n",a,b,a+b);}
		else if(op=='-') {
			System.out.printf("%d-%d=%d\n",a,b,a-b);}
		else if(op=='*') {
			System.out.printf("%d*%d=%d\n",a,b,a*b);}
		else if(op=='/') {
				if(b==0) {
					System.out.println("0으로 나눌 수 없습니다."); //중첩if문
				} 
				else {
					System.out.printf("%d/%d=%2f\n",a,b,a/(double)b);
				}
		}
	    else {  //연산자 외에 다른 문자를 입력했을 때 오류처리
		  System.out.println("잘못된 입력값입니다.");
	    }
		}		  

	}


