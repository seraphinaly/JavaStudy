import java.util.Scanner;
public class 제어문_단일조건문_쌀집계산기 {
//정수 2개, char 1(+,-,*,/) 사칙연산
	public static void main(String[] args) {
		int a, b, c; //a,b: 사용자입력, c:연산결과 저장
		char op='+';
		Scanner scan=new Scanner(System.in);
		System.out.print("첫 번째 정수 입력");
		a=scan.nextInt();
		System.out.print("두 번째 정수 입력");
		b=scan.nextInt();
		System.out.print("연산자(+,-,*,/):");
		op=scan.next().charAt(0); //Scanner: char를 처리 못함:charAt으로 전환
		                          //System.in:예외처리를 해야함
        if(op=='+') {
        	System.out.printf("%d+%d=%d\n",a,b,a+b);
        }
        if(op=='-') {
        	System.out.printf("%d-%d=%d\n",a,b,a-b);
        }
        if(op=='*') {
        	System.out.printf("%d*%d=%d\n",a,b,a*b);
        }
        if(op=='/') {
        	if(b==0) {
        		System.out.println("0으로 나눌 수 없습니다.");
        	} else
        	System.out.printf("%d/%d=%.2f\n",a,b,a/(double)b);
        }
        System.out.println("프로그램 종료"); //main:프로그램 시작, 종료 메소드
	}   

}
